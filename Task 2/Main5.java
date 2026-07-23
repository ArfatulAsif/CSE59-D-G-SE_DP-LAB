class Printer{
	void printdata(String text)
	{
		System.out.println("Textn: "+text);
	}
	void printdata(int number) {
		System.out.println("Number : "+number);
	}
}
public class main5 {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.printdata("Hello Java");
		printer.printdata(100);
	}

}

