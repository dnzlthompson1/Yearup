import java.util.Scanner;
public class Evenorodd 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter a number");
		int num=scan.nextInt();
		if (num%2==1){System.out.print("Number is odd");}
		else if(num%2==0){System.out.print("Number is even");}
		scan.close();
	}
}
