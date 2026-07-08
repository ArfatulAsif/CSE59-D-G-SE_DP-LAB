interface Printer {
    void printDocument();
}

// Scanner interface
interface Scanner {
    void scanDocument();
}

// Fax interface
interface FaxMachine {
    void faxDocument();
}

// MultiFunctionCopier supports all features
class MultiFunctionCopier implements Printer, Scanner, FaxMachine {
    public void printDocument() {
        System.out.println("Printing...");
    }

    public void scanDocument() {
        System.out.println("Scanning...");
    }

    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

// BasicPrinter only prints
class BasicPrinter implements Printer {
    public void printDocument() {
        System.out.println("Printing...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.printDocument();
        MultiFunctionCopier copier = new MultiFunctionCopier();
        copier.printDocument();
        copier.scanDocument();
        copier.faxDocument();

    }
}
