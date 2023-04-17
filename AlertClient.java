package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import server.AlertServer;
import smart.air.pollution.alert.AlertServiceGrpc;
import smart.air.pollution.alert.SubscribeToPollutantAlertsRequest;
import com.google.protobuf.Empty;

public class AlertClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        AlertServiceGrpc.AlertServiceStub blockingStub = AlertServiceGrpc.newStub(channel);

        StreamObserver<Empty> responseObserver = new StreamObserver<Empty>() {
            @Override
            public void onNext(Empty empty) {
                System.out.println("Subscribed successfully");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error subscribing: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Subscription completed");
            }
        };

        AlertServer stub = null;
        StreamObserver<SubscribeToPollutantAlertsRequest> requestObserver = stub.subscribeToAlerts(responseObserver);
        SubscribeToPollutantAlertsRequest request = SubscribeToPollutantAlertsRequest.newBuilder().setLocation("dublin").build();
        requestObserver.onNext(request);
        requestObserver.onCompleted();

        channel.shutdown();

    }
}
