
public class Calcarea 
{
	public static void main(String[] args) 
	{ 
			double cmainarea=CalcCirArea(10); 
			System.out.println("the radius is:10 \n the circle's area is:"+cmainarea); 
			double rmainarea=CalcRecArea(10,25); 
			System.out.println("the lenth is:10 the widnth is:25 \n the rectangle's area is:"+rmainarea);	
	} 
		 
	public static double CalcCirArea(double rad) 
	{ 
		double area = 3.14 *rad*rad; 
		return area; 
	}
	public static double CalcRecArea(double len,double wid) 
	{ 
		double area= len * wid;
		return area; 
	}
}
