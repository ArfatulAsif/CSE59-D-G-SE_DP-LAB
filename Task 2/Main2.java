class Numberchecker{
	void check(int num)
	{
		boolean result = (num%2==0)&&(num>10);
		System.out.println(result);
	}
}
public class main2 {

	public static void main(String[] args) {
		Numberchecker checker = new Numberchecker();
		 checker.check(14);
		

	}

}

