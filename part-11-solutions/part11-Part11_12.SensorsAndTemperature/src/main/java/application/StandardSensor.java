
package application;

public class StandardSensor implements Sensor {
    
    private int temperature;
    //private boolean setting;
    
    public StandardSensor(int temperature) {
        this.temperature = temperature;
        //this.setting = true;
    }
    
    public boolean isOn() {
        
        boolean setting = true;
        if (setting == true) {
            return true;
        }    
        return false;
    }
    
    public void setOn() {
        //this.setting = true;
    }
    
    public void setOff() {
        //this.setting = false;
    }
    
    public int read() {
        return this.temperature;
    }
    
    
    
    
    
}
