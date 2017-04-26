package SOLID;

/**
 * Created by Eric on 24/01/2017.
 */

// This interface defines methods for all sensors to implement.
public interface Sensor {

    /**
     * @return TRUE/FALSE for whether the sensor is triggered or not.
     */
    boolean isTriggered();

    /**
     * @return a description of the location of the sensor
     */
    String getLocation();

    /**
     * @return a textual description of the sensor type
     */
    String getSensorType();

    /**
     * @return a number between 0-100 where 0 is empty and 100 is fully charged.
     */
    double getBatteryPercentage();
}
