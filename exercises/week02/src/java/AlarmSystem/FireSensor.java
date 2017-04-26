package AlarmSystem;

public class FireSensor implements Sensor {

  private boolean triggered;
  private String location;
  private String sensorType;
  private double batteryPercentage = 100.00;

  public FireSensor(boolean triggered, String location) {
    this.triggered = triggered;
    this.location = location;
  }

  @Override
  public boolean isTriggered() {
    return triggered;
  }

  @Override
  public String getLocation() {
    return location;
  }

  @Override
  public String getSensorType() {
    return sensorType;
  }

  @Override
  public double getBatteryPercentage() {
      this.batteryPercentage -= 10.00;
      return batteryPercentage;
  }
}