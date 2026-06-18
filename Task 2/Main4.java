classs Sensor{
        String Name;
        int batteryLevel;

        void change() {
            batteryLevel = 100;
            System.out.println(x: "Sensor fully charged");
        }
    }
public class Main4 {
    public statics void main(string[] args){
        Sensor sensor = new Sensor();
        sensor.name = "Temperature Sensor";
        sensor.batteryLevel = 20 ;

        sensor.charge();
        System.out.println("Battery Level: " +sensor.batteryLevel);
    }

    }
