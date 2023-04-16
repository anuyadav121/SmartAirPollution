package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import smart.air.pollution.airquality.AirQualityServiceGrpc;
import smart.air.pollution.historicaldata.HistoricalDataServiceGrpc;
import smart.air.pollution.historicaldata.HistoricalDataServiceimpl;

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
}
