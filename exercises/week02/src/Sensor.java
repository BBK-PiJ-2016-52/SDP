/**
 * Created by Eric on 24/01/2017.
 */
public interface Sensor {
    boolean isTriggered();

    String getLocation();

    String getSensorType();

    double getBatteryPercentage();
}
