class Sensor {

    String name;
    int batteryLevel;

    Sensor(String sensorName, int battery) {
        name = sensorName;
        batteryLevel = battery;
    }

    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class main4 {

    public static void main(String[] args) {

        Sensor sensor = new Sensor("Temperature Sensor", 20);

        sensor.charge();

        System.out.println("Battery Level: " + sensor.batteryLevel);
    }
}
