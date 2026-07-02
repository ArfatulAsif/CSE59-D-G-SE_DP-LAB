class Applet {
    void launch() {
        System.out.println("applet launched");
    }
}

class GameApplet extends Applet{
    void play(){
        System.out.println("playing game");
    }
}

public class main6 {
    public static void main(String[] arrgs){
        GameApplet game = new GameApplet();
        game.launch();
        game.play();
    }
}

