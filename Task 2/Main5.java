
package Labtasks;
  class printer{
      void printdata(String text){
          System.out.println("Text: "+text);
      }
      void printdata(int num){
          System.out.println("Number: "+num);
      }
  
  }
public class Main5 {
    public static void main(String[]args){
        printer printer = new printer();
        printer.printdata("Hello Java");
        printer.printdata(100);
    }
    
}
