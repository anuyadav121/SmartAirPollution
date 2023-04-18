package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import smart.air.pollution.historicaldata.GetHistoricalDataRequest;
import smart.air.pollution.historicaldata.GetHistoricalDataResponse;
import smart.air.pollution.historicaldata.HistoricalDataServiceGrpc;


public class HistoricalDataClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        HistoricalDataServiceGrpc.HistoricalDataServiceStub asyncStub = HistoricalDataServiceGrpc.newStub(channel);

        StreamObserver<GetHistoricalDataRequest> requestObserver = asyncStub.getHistoricalData(new StreamObserver<GetHistoricalDataResponse>() {
            @Override
            public void onNext(GetHistoricalDataResponse response) {
                System.out.println("Response got: " + response);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error occurred: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed streaming");
            }
        });

        GetHistoricalDataRequest request = GetHistoricalDataRequest.newBuilder()
                .setLocation("dublin")
                .setStartTime(0)
                .setEndTime(System.currentTimeMillis())
                .build();
        requestObserver.onNext(request);
        requestObserver.onCompleted();

        channel.shutdown();
    }
}