interface Printer{
    void printDocument();
}
interface Scanner{
    void scanDocument();
}
interface FaxMachine{
    void faxDocument();
}
class MultiFuntionCopier implements Printer, Scanner, FaxMachine{
    public void printDocument(){
        System.out.println("Printin...");
    }
    public void scanDocument(){
        System.out.println("Scanning.....");
    }
    public void faxDocument(){
        System.out.println("Faxing.....");
    }
}
class BasicPrinter implements Printer{
    public void printDocument(){
        System.out.println("Printing");
    }
}
public class Main2 {
    public static void main(String[] args){
        Printer basicPrinter = new BasicPrinter();
        System.out.println("Basic Printer: ");
        basicPrinter.printDocument();
        System.out.println();
        MultiFuntionCopier copier = new MultiFuntionCopier();
        System.out.println("MultiFuction Copier");
        copier.printDocument();
        copier.scanDocument();
        copier.faxDocument();
    }
}
