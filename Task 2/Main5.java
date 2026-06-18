
class Printer {
     void printData(String text){
        System.out.println(text);   
      }
      void printData(int number){
        System.out.println(number);
      }
}
public class Main5 {
    public statics void main(String[] ags){
        Printer printer = new Printer();
         
        printer.printerData(text: "Hello,world!");
        printer.printerData(number: 123);
    }
}
