interface Clickable{
    void oneclick();
    }
class Button implements Clickable{
        
    public void oneclick(){
        System.out.println("Button was clicked");
    }
}
public class Main7 {
    public static void main(String[] args) {
        Button haaland = new Button();
        haaland.oneclick();
    }
}

