import java.util.Scanner;
public class Dayofweek 
{
	public static void main(String[] args) 
	{
		String wday=null; 
		Scanner scan=new Scanner (System.in);
		System.out.print("Type the day of the week");
		wday=scan.next();
		eval(wday);
		scan.close();
	}
	static void eval(String day)
	{
		if (day!=null)
		{
			if (
					day.equalsIgnoreCase("Monday") 
					||day.equalsIgnoreCase("Tuesday")
					||day.equalsIgnoreCase("Wednesday") 
					||day.equalsIgnoreCase("Thursday")
					||day.equalsIgnoreCase("Friday")
				) 
				System.out.print (day +" is a week day.");
			else if (day.equalsIgnoreCase("Saturday ")||day.equalsIgnoreCase("Sunday"))
				System.out.print (day +" is the weekend");
			else System.out.print (day +" is not a valid day of week");
		}
		else System.out.print ("\nInput something next time");
	}
}
