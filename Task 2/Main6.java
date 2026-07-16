class Applet{
    void launch(){
        System.out.println("Applet launched");
    }
}
class GameApplet extends Applet{
    void play(){
        System.out.println("Playing game");
    }
}
public class Main6 {
    public static void main(String[] args) {
        GameApplet mbappe = new GameApplet();
        mbappe.launch();
        mbappe.play();
    }
}

