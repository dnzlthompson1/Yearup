import java.util.Scanner;
public class TipCal 
{
	double tipPercent;

	public static void main(String[] args) 
	{
		System.out.println("Put in check total");
		Scanner scan= new Scanner(System.in);
		double checkTotal=100;
		checkTotal=scan.nextDouble();
		System.out.format("If your check total is %.2f%n",checkTotal);
		System.out.format("your check total pluss a tip of 15 percent is %.2f%n",checkTotal+checkTotal*.15);
		System.out.format("your check total pluss a tip of 20 percent is %.2f%n",checkTotal+checkTotal*.20);
		System.out.format("your check total pluss a tip of 25 percent is %.2f%n",checkTotal+checkTotal*.25);
		scan.close();
	}
}