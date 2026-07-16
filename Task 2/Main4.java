class sensor{
    String name;
    int batteryLevel;
    void charge(int set){
        this.batteryLevel=set;
        System.out.println("Sensor fully charged");
    }
}
public class Main4 {
    public static void main(String[] args) {
        sensor neymar = new sensor();
        neymar.charge(100);
    }  
}
