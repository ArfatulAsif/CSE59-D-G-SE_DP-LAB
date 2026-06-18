class sensor{
    String name;
    int batterLevel;
    void charge(int set){
        this.batterLevel=set;
        System.out.println("Sensor fully charged");
    }
}
public class Main4 {
    public static void main(String[] args) {
        sensor fein = new sensor();
        fein.charge(100);
    }
    
}
