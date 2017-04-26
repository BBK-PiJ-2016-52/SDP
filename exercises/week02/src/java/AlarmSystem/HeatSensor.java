package AlarmSystem;

public class HeatSensor implements SecuritySensor{
    @Override
    public boolean isTriggered() {
        return false;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public String getSensorType() {
        return null;
    }

    @Override
    public double getBatteryPercentage() {
        return 0;
    }


}
