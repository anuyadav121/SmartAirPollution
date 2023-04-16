package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import smart.air.pollution.airquality.AirQualityServiceGrpc;
import smart.air.pollution.alert.AlertServiceGrpc;

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
}
