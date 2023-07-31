
package application;

import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> sensorList;
    private List<Integer> readingList;
    
    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readingList = new ArrayList<>();
        
    }
    
    
    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }
    
    public boolean isOn() {
        
        for (Sensor sensors: sensorList) {
            if (!(sensors.isOn() == true)) {
            return false;
            }    

        }
        return true;
    }
    
    public void setOn() {
        
        for (Sensor sensors: sensorList) {
            sensors.setOn();
        }
        
    }
    
    public void setOff() {
        for (Sensor sensors: sensorList) {
            sensors.setOff();
        }
    }
    
    public int read() {
        
        if (this.sensorList.isEmpty()) {
            throw new IllegalStateException();
        }
        
        for (Sensor sensors: sensorList) {
            if (!(sensors.isOn() == true)) {
            throw new IllegalStateException();
            }    
        }
        
        int average = 0;
        int sum = 0;
        int count = 0;
        
        for (Sensor sensors: sensorList) {
            sum += sensors.read();
            count++;
        }
        
        average = sum / count;
        readingList.add(average);
        return average;

    }
    
    public List<Integer> readings() {
        return this.readingList;
    }
}
