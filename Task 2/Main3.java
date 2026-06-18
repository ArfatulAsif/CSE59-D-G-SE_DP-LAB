class Countdown{
    void start(){
        for(int i =5 ; i>0;i--){
            System.out.println(i);
        }
        System.out.println("Go!");
    }
}
public class Main3 {
    public static void main(String[] args) {
     Countdown messi =new Countdown();
     messi.start();
    }
 
}
