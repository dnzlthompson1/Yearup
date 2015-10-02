
public class Circle 
{
	String color;
	double radius;
	Circle(double rad)
	{
		color="gray";
		radius=rad;
	}
	Circle(String col, double rad)
	{
		color=col;
		radius=rad;
	}
	double getArea()
	{
		double area= 3.14*radius*radius;
		return area;
	} 
	void writeCol()
	{
		System.out.println("this circle's color is "+color);
	}
	
	public static void main(String[] args) 
	{ 
		Circle bigcircle = new Circle("blue",10);
		Circle smallcircle = new Circle(5);
		System.out.println("the big cicle's radius is"+bigcircle.radius);
		bigcircle.writeCol();
		System.out.println("the small cicle's radius is"+smallcircle.radius);
		bigcircle.writeCol();
	}
	
}
