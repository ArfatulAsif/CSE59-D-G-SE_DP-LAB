class Sensor{
    String name;
    int batteryLevel;

    public void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");

    }
}

public class Main4 {
    public static void main(String[] args) {
        Sensor mySensor = new Sensor();
        mySensor.name = "Proximity Sensor";
        mySensor.batteryLevel = 12;

        System.out.println(mySensor.name + " initial battery: "+ mySensor.batteryLevel + "%");
        mySensor.charge();
        
        System.out.println(mySensor.name + " current battery: "+ mySensor.batteryLevel + "%");
        
        
    }
}
