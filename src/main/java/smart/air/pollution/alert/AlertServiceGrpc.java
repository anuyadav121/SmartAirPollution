package smart.air.pollution.alert;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: AlertService.proto")
public final class AlertServiceGrpc {

  private AlertServiceGrpc() {}

  public static final String SERVICE_NAME = "AlertService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smart.air.pollution.alert.SubscribeToPollutantAlertsRequest,
      com.google.protobuf.Empty> getSubscribeToPollutantAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToPollutantAlerts",
      requestType = smart.air.pollution.alert.SubscribeToPollutantAlertsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<smart.air.pollution.alert.SubscribeToPollutantAlertsRequest,
      com.google.protobuf.Empty> getSubscribeToPollutantAlertsMethod() {
    io.grpc.MethodDescriptor<smart.air.pollution.alert.SubscribeToPollutantAlertsRequest, com.google.protobuf.Empty> getSubscribeToPollutantAlertsMethod;
    if ((getSubscribeToPollutantAlertsMethod = AlertServiceGrpc.getSubscribeToPollutantAlertsMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getSubscribeToPollutantAlertsMethod = AlertServiceGrpc.getSubscribeToPollutantAlertsMethod) == null) {
          AlertServiceGrpc.getSubscribeToPollutantAlertsMethod = getSubscribeToPollutantAlertsMethod = 
              io.grpc.MethodDescriptor.<smart.air.pollution.alert.SubscribeToPollutantAlertsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AlertService", "SubscribeToPollutantAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart.air.pollution.alert.SubscribeToPollutantAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("SubscribeToPollutantAlerts"))
                  .build();
          }
        }
     }
     return getSubscribeToPollutantAlertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smart.air.pollution.alert.UnsubscribeFromAlertsRequest,
      com.google.protobuf.Empty> getUnsubscribeFromAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsubscribeFromAlerts",
      requestType = smart.air.pollution.alert.UnsubscribeFromAlertsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smart.air.pollution.alert.UnsubscribeFromAlertsRequest,
      com.google.protobuf.Empty> getUnsubscribeFromAlertsMethod() {
    io.grpc.MethodDescriptor<smart.air.pollution.alert.UnsubscribeFromAlertsRequest, com.google.protobuf.Empty> getUnsubscribeFromAlertsMethod;
    if ((getUnsubscribeFromAlertsMethod = AlertServiceGrpc.getUnsubscribeFromAlertsMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getUnsubscribeFromAlertsMethod = AlertServiceGrpc.getUnsubscribeFromAlertsMethod) == null) {
          AlertServiceGrpc.getUnsubscribeFromAlertsMethod = getUnsubscribeFromAlertsMethod = 
              io.grpc.MethodDescriptor.<smart.air.pollution.alert.UnsubscribeFromAlertsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AlertService", "UnsubscribeFromAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart.air.pollution.alert.UnsubscribeFromAlertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("UnsubscribeFromAlerts"))
                  .build();
          }
        }
     }
     return getUnsubscribeFromAlertsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlertServiceStub newStub(io.grpc.Channel channel) {
    return new AlertServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlertServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlertServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlertServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlertServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AlertServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<smart.air.pollution.alert.SubscribeToPollutantAlertsRequest> subscribeToPollutantAlerts(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubscribeToPollutantAlertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void unsubscribeFromAlerts(smart.air.pollution.alert.UnsubscribeFromAlertsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnsubscribeFromAlertsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeToPollutantAlertsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                smart.air.pollution.alert.SubscribeToPollutantAlertsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SUBSCRIBE_TO_POLLUTANT_ALERTS)))
          .addMethod(
            getUnsubscribeFromAlertsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smart.air.pollution.alert.UnsubscribeFromAlertsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UNSUBSCRIBE_FROM_ALERTS)))
          .build();
    }
  }

  /**
   */
  public static final class AlertServiceStub extends io.grpc.stub.AbstractStub<AlertServiceStub> {
    private AlertServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<smart.air.pollution.alert.SubscribeToPollutantAlertsRequest> subscribeToPollutantAlerts(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSubscribeToPollutantAlertsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void unsubscribeFromAlerts(smart.air.pollution.alert.UnsubscribeFromAlertsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnsubscribeFromAlertsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlertServiceBlockingStub extends io.grpc.stub.AbstractStub<AlertServiceBlockingStub> {
    private AlertServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.protobuf.Empty unsubscribeFromAlerts(smart.air.pollution.alert.UnsubscribeFromAlertsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnsubscribeFromAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlertServiceFutureStub extends io.grpc.stub.AbstractStub<AlertServiceFutureStub> {
    private AlertServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlertServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlertServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unsubscribeFromAlerts(
        smart.air.pollution.alert.UnsubscribeFromAlertsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnsubscribeFromAlertsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNSUBSCRIBE_FROM_ALERTS = 0;
  private static final int METHODID_SUBSCRIBE_TO_POLLUTANT_ALERTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlertServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlertServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNSUBSCRIBE_FROM_ALERTS:
          serviceImpl.unsubscribeFromAlerts((smart.air.pollution.alert.UnsubscribeFromAlertsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_TO_POLLUTANT_ALERTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribeToPollutantAlerts(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AlertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlertServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smart.air.pollution.alert.AlertServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlertService");
    }
  }

  private static final class AlertServiceFileDescriptorSupplier
      extends AlertServiceBaseDescriptorSupplier {
    AlertServiceFileDescriptorSupplier() {}
  }

  private static final class AlertServiceMethodDescriptorSupplier
      extends AlertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlertServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AlertServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlertServiceFileDescriptorSupplier())
              .addMethod(getSubscribeToPollutantAlertsMethod())
              .addMethod(getUnsubscribeFromAlertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
