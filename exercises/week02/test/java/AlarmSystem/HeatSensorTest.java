package AlarmSystem;

import org.junit.Test;

import static org.junit.Assert.*;


public class HeatSensorTest {
    @Test
    public void testThatIsTriggeredReturnsFalse() {
        HeatSensor sensor = new HeatSensor();
        boolean isTriggered = sensor.isTriggered();
        assertEquals(false, isTriggered);
    }

    @Test
    public void testThatGetLocationReturnsNull() {
        HeatSensor sensor = new HeatSensor();
        String location = sensor.getLocation();
        assertEquals(null, location);
    }

    @Test
    public void testThatGetSensorTypeReturnsNull() {
        HeatSensor sensor = new HeatSensor();
        String sensorType = sensor.getSensorType();
        assertEquals(null, sensorType);
    }

    @Test
    public void testThatGetBatteryPercentageReturnsNegativeOne() {
        HeatSensor sensor = new HeatSensor();
        double batteryPercentage = sensor.getBatteryPercentage();
        assertEquals(-1.0, batteryPercentage, 0.01);
    }


}