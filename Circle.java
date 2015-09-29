
public class  Circle
{
	public static void main(String[] args)
	{
		double cmainarea=CalcCirArea(10);
		System.out.println("the radius is:10 / the circle's area :"+cmainarea);
	}
	
	public static double CalcCirArea(double rad)
	{
		double area = 3.14 *rad*rad;
		return area;
	}

}
