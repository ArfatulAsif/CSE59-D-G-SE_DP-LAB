class Printer{
    void printData(String text){
        System.out.println("Printing text: " + text);
    }
    void printData(int number){
        System.out.println("Printing number: " + number);
    }
}
public class Main5 {
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.printData("Hello World");
        printer.printData(123);
    }
    
}

