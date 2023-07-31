
package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    
    private int temperature;
    private boolean setting;
    
    public TemperatureSensor() {
        this.temperature = temperature;
        this.setting = false;
    }
    
    public boolean isOn() {
        
        if (setting == true) {
            return true;
        }    
        return false;
    }
    
    public void setOn() {
        this.setting = true;
    }
    
    public void setOff() {
        this.setting = false;
    }
    
    public int read() {
        
        if (setting == true) {
            return new Random().nextInt(61) + -30;
        }
        throw new IllegalStateException();
    }
    
}
