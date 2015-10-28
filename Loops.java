
public class Loops 
{
	public static void main(String[] args) 
	{
		int []numSet1={37,67,67,65,35,56,56,45,61,19,59};
		printSet(numSet1,"Set1");
		find(67,numSet1,"Set1");
		occurance(67,numSet1,"Set1");
				
	}
	public static void printSet(int set[], String setName)
	{
		System.out.print(setName+": "+set[0]);
		for(int i=1;i<set.length;i++)
		{
			System.out.print(","+set[i]);
		}
		System.out.print("\n");
	}
	public static void find(int num, int set[], String setName)
	{
		if(set!=null)
		{
			if(set.length>0)	
			{
				int occur=0;
				for(int i = 0; i<set.length;i++)
				{
					if(num==set[i]){occur++;break;}
				}
				if(occur==0)System.out.println(""+num+" was not found in "+setName);
				else System.out.println(""+num+" was found in "+setName);
			}
		}
	}
	public static void occurance(int num, int set[], String setName)
	{
		if(set!=null)
		{
			if(set.length>0)	
			{
				int occur=0;
				for(int i = 0; i<set.length;i++)
				{
					if(num==set[i]){occur++;}
				}
				System.out.println("The occurance of "+num+" in "+setName+" is:"+occur);
			}
		}
	}
}
