import java.util.*;
public class revString 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Type what you want to reverse here:");
		String input=scan.nextLine();
		inpl(input);
		System.out.print("Type something new to reverse here:") ;
		input=scan.nextLine();
		outpl(input);
		scan.close();
	}
	
	public static void inpl(String str) 
	{
		char[]c=str.toCharArray();
		for( int i=0 ; i<(c.length/2) ;i++)
		{
			char hold=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=hold;	
		}
		String nstr= new String(c);
		System.out.println(str+" reveresed is: "+nstr);
	}
	public static void outpl(String str)
	{
		char[]c=str.toCharArray();
		char[]d= new char[str.length()];
		for (int i=0;i<c.length;i++)
		{
			d[c.length-i-1]=c[i];	
		}
		String nstr= new String(d);
		System.out.println(str+" reveresed is: "+nstr);
	}
}
