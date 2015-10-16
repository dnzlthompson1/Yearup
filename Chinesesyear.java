import java.util.Scanner;
public class Chinesesyear 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int inputyear=sc.nextInt();
		evalChinaYear(inputyear); 
	}

	private static void evalChinaYear(int year) 
	{
		int yearcode=(year-1900)%12;
		switch (yearcode)
		{
		case 0:
			System.out.print(year +" is year of rat");
			break;
		case 1:
			System.out.print(year +" is year of ox");
			break;
		case 2:
			System.out.print(year +" is year of tiger");
			break;
		case 3:
			System.out.print(year +" is year of rabbit");
			break;
		case 4:
			System.out.print(year +" is year of dragon");
			break;
		case 5:
			System.out.print(year +" is year of snake");
			break;
		case 6:
			System.out.print(year +" is year of horse");
			break;
		case 7:
			System.out.print(year +" is year of sheep");
			break;
		case 8:
			System.out.print(year +" is year of monkey");
			break;
		case 9:
			System.out.print(year +" is year of rooster");
			break;
		case 10:
			System.out.print(year +" is year of dog");
			break;
		case 11:
			System.out.print(year +" is year of pig");
			break;
		default:
			System.out.print("try again");
		}
	
		
	}

}
