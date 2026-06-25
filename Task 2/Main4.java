class Sensor {
    
    String name;
    int batteryLevel;

    
    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}


public class Main4 {
    public static void main(String[] args) {
        
        Sensor mySensor = new Sensor();
        
        
        mySensor.name = "Temperature_Node_01";
        mySensor.batteryLevel = 15;
        
        System.out.println("Initial battery level for " + mySensor.name + ": " + mySensor.batteryLevel + "%");
        
        
        mySensor.charge();
        
        
        System.out.println("Verified battery level: " + mySensor.batteryLevel + "%");
    }
}
    
