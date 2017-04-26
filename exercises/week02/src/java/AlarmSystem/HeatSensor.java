package AlarmSystem;

public class HeatSensor implements SecuritySensor{

    private boolean triggered;
    private String location;
    private String sensorType;

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
        return 0;
    }


}
