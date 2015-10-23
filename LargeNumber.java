
public class LargeNumber 
{
	public static void main(String[] args) 
	{
		System.out.print(whilfindlargenum()+" "+forfindlargenum());
	}
	public static int whilfindlargenum()
	{
		int[]num={-56,33,71,-6,56,7};
		int largenum=num[0];
		int i=0;
		while (i<num.length)
		{
			if(largenum<num[i]){largenum=num[i];}
			i++;
		}
		return largenum;
	}
	public static int forfindlargenum() 
	{
		int[]num={-56,33,76,56,7};
		int largenum=num[0];
		
		for (int i=0;i<num.length;i++)
		{
			if(largenum<num[i]){largenum=num[i];}
		}
		return largenum;
	}
	
	
}
