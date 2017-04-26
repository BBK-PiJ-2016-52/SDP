package AlarmSystem;
public interface Sensor {
  boolean isTriggered();

  String getLocation();

  String getSensorType();

  /*double getBatteryPercentage();
  This method break Single-Responsibility Principle because
  it cannot be extended for other Sensors that doesn't need battery and its implementation is necessary.
*/}