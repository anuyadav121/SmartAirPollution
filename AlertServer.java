package server;

import com.google.protobuf.Empty;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import smart.air.pollution.alert.AlertServiceGrpc;
import smart.air.pollution.alert.SubscribeToPollutantAlertsRequest;
import smart.air.pollution.alert.UnsubscribeFromAlertsRequest;

import java.io.IOException;

public class AlertServer extends AlertServiceGrpc.AlertServiceImplBase {
    public static void main(String[] args) throws InterruptedException, IOException {
        AlertServer alertServer = new AlertServer();

        int port = 50053;

        Server server = ServerBuilder.forPort(port)
                .addService(alertServer)
                .build()
                .start();

        System.out.println("AlertServer started, listening on " + port);

        server.awaitTermination();
    }

    public StreamObserver<SubscribeToPollutantAlertsRequest> subscribeToAlerts(StreamObserver<Empty> responseObserver) {
        System.out.println("subscribed to alerts");

        return new StreamObserver<SubscribeToPollutantAlertsRequest>() {
            public void onNext(SubscribeToPollutantAlertsRequest value) {
                System.out.println("subscribe request for location: " + value.getLocation());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Stream completed");
                responseObserver.onNext(Empty.getDefaultInstance());
                responseObserver.onCompleted();
            }

        };
    }

    @Override
    public void unsubscribeFromAlerts(UnsubscribeFromAlertsRequest request, StreamObserver<Empty> responseObserver) {
        System.out.println("Client unsubscribed from alerts for location: " + request.getLocation());
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}

