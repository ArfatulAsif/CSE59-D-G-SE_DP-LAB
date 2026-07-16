interface Clickable{
    void onclick();
}
class Button implements Clickable{

    @Override
    public void onclick() {
        System.out.println("Button was clicked");
    }
    
} 

public class Main7 {
    public static void main(String[] args) {
        Button haland = new Button();
        haland.onclick();
    }
}

