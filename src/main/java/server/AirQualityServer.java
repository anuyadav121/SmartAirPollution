package server;

import com.google.protobuf.Timestamp;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import smart.air.pollution.airquality.*;

import java.io.IOException;
import java.time.Instant;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

public class AirQualityServer extends AirQualityServiceGrpc.AirQualityServiceImplBase {
    public static void main(String[] args) throws InterruptedException, IOException {
        AirQualityServer airQualityServer = new AirQualityServer();

        int port = 50051;

        Server server = ServerBuilder.forPort(port)
                .addService(airQualityServer)
                .build()
                .start();

        System.out.println("AirQualityServer started, listening on " + port);

        server.awaitTermination();
    }


    @Override
    public void getLatestAirQualityData(GetLatestAirQualityDataRequest request,
                                        StreamObserver<GetLatestAirQualityDataResponse> responseObserver) {
        //prepare the value to be set back
        GetLatestAirQualityDataResponse reply = GetLatestAirQualityDataResponse
                .newBuilder()
                .setAqi(1)
                .setPollutants(Pollutant.newBuilder().setName(request.getLocation()).setLevel(4.0f).build())
                .setHealthEffects("Danger")
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    /**
     *
     */
    @Override
    public void getAirQualityDataByTimeRange(GetAirQualityDataByTimeRangeRequest request,
                                             StreamObserver<GetAirQualityDataByTimeRangeResponse> responseObserver) {
        //prepare the value to be set back
        GetAirQualityDataByTimeRangeResponse reply = GetAirQualityDataByTimeRangeResponse
                .newBuilder()
                .setAqi(1)
                .setPollutants(Pollutant.newBuilder().setName(request.getLocation()).setLevel(4.0f).build())
                .setTimeStamp(new java.sql.Timestamp(System.currentTimeMillis()).getTime())
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }


}