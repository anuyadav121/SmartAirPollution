// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AirQualityService.proto

package smart.air.pollution.airquality;

public interface GetAirQualityDataByTimeRangeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAirQualityDataByTimeRangeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 TimeStamp = 1;</code>
   */
  long getTimeStamp();

  /**
   * <code>int32 aqi = 2;</code>
   */
  int getAqi();

  /**
   * <code>.Pollutant pollutants = 3;</code>
   */
  boolean hasPollutants();
  /**
   * <code>.Pollutant pollutants = 3;</code>
   */
  smart.air.pollution.airquality.Pollutant getPollutants();
  /**
   * <code>.Pollutant pollutants = 3;</code>
   */
  smart.air.pollution.airquality.PollutantOrBuilder getPollutantsOrBuilder();
}
