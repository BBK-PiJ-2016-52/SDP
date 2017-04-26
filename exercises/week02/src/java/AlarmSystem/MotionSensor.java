package AlarmSystem;

public class MotionSensor implements Sensor {

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

}
