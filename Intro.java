
package java3;
import java.util.Scanner;

public class Intro 
{

	public static void main(String[] args) 
	throws java.io.IOException
	{
		Scanner scanner = new Scanner(System.in);
		int num=5;
		System.out.print (num);
		num=scanner.nextInt(); 
		//num= (int) System.in.read();
		System.out.print (num);
		scanner.close();
	}	
	
