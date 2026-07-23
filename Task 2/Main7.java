interface Clickable { 
    void onClick();
}
class Button implements Clickable{
    @Overridepublic void onClick() {
        System.out.println(x: "Button was clicked!");

    }
}
public class Main7 {
    public static void main(String[] args){
        Button button = new Button();
        button.onClick();
    }
}
