
class Printer{
    void printdata(String text)
    {
        System.out.println(text);
    }
    void printdata(int number){
        System.out.println(number);
    }
}
class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printdata("hello world");
        printer.printdata(123);
    }
}
