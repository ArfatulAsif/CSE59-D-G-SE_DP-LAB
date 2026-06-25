
class Printer {
    
    
    void printData(String text) {
        System.out.println("Printing String data: " + text);
    }
    
    
    void printData(int number) {
        System.out.println("Printing Integer data: " + number);
    }
}


public class Main5 {
    public static void main(String[] args) {
        
        Printer myPrinter = new Printer();
        
        
        myPrinter.printData("Hello, Java!");
        
        
        myPrinter.printData(42);
    }
}
    
