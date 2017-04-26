package AlarmSystem;


import java.time.LocalTime;
import java.util.List;

public class SecurityControlUnit extends ControlUnit {

    public SecurityControlUnit(List<Sensor> sensorList) {
        super.pollSensors();
    }

    @Override
    public void pollSensors() {
        if(timeToCheck()) {
            super.pollSensors();
        } else {
            System.out.println("Security Sensors not activated at " + LocalTime.now().toString());
        }
    }


    private boolean timeToCheck() {
        if (LocalTime.now().isBefore(LocalTime.of(6,00)) || LocalTime.now().isAfter(LocalTime.of(22,00)) ) {
            return true;
        } else {
            return false;
        }
    }


}