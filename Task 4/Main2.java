package lab04;

public class Main2 {
    interface Printer{
        void printDocument();
    }
    
    interface Scanner{
       void scanDocument();
    }
    interface FaxMachine{
        void faxDocument();
    }
    
    static class MultiFunctionCopier implements Printer, Scanner, FaxMachine{
      public void printDocument(){
      System.out.println("Printing...");
      }
      public void scanDocument(){
      System.out.println("Scanning...");
      }
      public void faxDocument(){
      System.out.println("Faxing...");
      }
    }
    
    static class BasicPrinter implements Printer{
       public void printDocument(){
      System.out.println("Printing...");
      }
    }
    public static void main (String[]args){
      MultiFunctionCopier copier=new MultiFunctionCopier();
      BasicPrinter printer=new BasicPrinter();
      
      System.out.println("Multifunction Copier:");
      copier.printDocument();
      copier.scanDocument();
      copier.faxDocument();
      
      System.out.println("\nBasic Printer:");
      printer.printDocument();
    }
}

