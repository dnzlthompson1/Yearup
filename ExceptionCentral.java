package ecept;

public class ExceptionCentral
{
	public static void main(String []arg)
	{
		try 
		{
			ArithmeticException();
			try
			{
				aNullPointerException();
			}
			catch(NullPointerException e)
			{
				System.out.print("a null pointer error occured");
			}
		}
		catch( ArithmeticException e2)
		{
			System.out.print("an arthimic error occured");
			double errordouble =0;
		}
	}
	static void ArithmeticException()
	{
		double errordouble =5/0;
	}
	static void aNullPointerException()
	{
		int nothing = (Integer) null;
		System.out.print(""+nothing);
		
	}
	//The third method will not declare throws exception – you will catch the exception and handle it in this method.

}
