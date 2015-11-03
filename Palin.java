import java.util.*;
public class Palin 
{
	public static void main(String[] args) 
	{
		System.out.println("Input a string.");
		Scanner scan= new Scanner(System.in);
		String input="";
		while(!input.equals("q"))
		{
			input=scan.nextLine();
			if (input=="q")break;
			palCheck(input);
			System.out.println("Input another string or enter q to quit");
		}
		scan.close();
	}

	private static void palCheck(String str)
	{
		String hold=str.replace(" ","");
		char[] aofstr= hold.toCharArray();
		boolean palof = true;
		for(int i=0; i<aofstr.length/2;i++)
		{
			if (aofstr[i]!=aofstr[aofstr.length-i-1]){palof = false;}
		}
		if (palof){System.out.println(str+" is a palindrone");}
		else System.out.println(str+" is not a palindrone");
	}
	

}
