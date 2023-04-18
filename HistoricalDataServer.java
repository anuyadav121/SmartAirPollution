package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import smart.air.pollution.historicaldata.GetHistoricalDataRequest;
import smart.air.pollution.historicaldata.GetHistoricalDataResponse;
import smart.air.pollution.historicaldata.HistoricalDataServiceGrpc;

import java.io.IOException;

public class HistoricalDataServer extends HistoricalDataServiceGrpc.HistoricalDataServiceImplBase {
    public static void main(String[] args) throws InterruptedException, IOException {
        HistoricalDataServer historicalDataServer = new HistoricalDataServer();

        int port = 50052;

        Server server = ServerBuilder.forPort(port)
                .addService(historicalDataServer)
                .build()
                .start();

        System.out.println("HistoricalDataServer started, listening on " + port);

        server.awaitTermination();
    }

    @Override
    public StreamObserver<GetHistoricalDataRequest> getHistoricalData(StreamObserver<GetHistoricalDataResponse> responseObserver) {
        return null;
    }
}

    class HistoricalDataServiceImpl extends HistoricalDataServiceGrpc.HistoricalDataServiceImplBase {

        @Override
        public StreamObserver<GetHistoricalDataRequest> getHistoricalData(StreamObserver<GetHistoricalDataResponse> responseObserver) {
            return new StreamObserver<GetHistoricalDataRequest>() {
                @Override
                public void onNext(GetHistoricalDataRequest request) {

                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {
                    responseObserver.onCompleted();
                }
            };
        }
    }


