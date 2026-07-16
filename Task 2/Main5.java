class Printer{
    void printData(String text){
        System.out.println(text);
    }
    void printData(int number){
        System.out.println(number);
    }
}
public class Main5 {
    public static void main(String[] args) {
        Printer donald = new Printer();
        donald.printData("Good Evening");
        donald.printData(420);
             
    }
}
