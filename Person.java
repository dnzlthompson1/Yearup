
public class Person 
{
	Person()
	{
		age=40;
		phNum="555-555-4587";
		name="John Doe";
		address="1500 Penn Ave D.C.";
	}
	void ages(){age++;}
	int age;
	//phone number
	String phNum;
	String name;
	String address;
	
	int getAge(){return age;}
	String getAddress(){return address;}
	String getName(){return name;}
	String getPhNum(){return phNum;}
	
	void setAge(int set){age=set;}
	void setAddress(String set){ address =set;}
	void setName(String set){ name=set;}
	void setPhNum(String set){ phNum=set;}
}

abstract class Main
{
	public static void main(String[] args) 
	{
		Person john=new Person();
		System.out.println
		(
			"Here's a person \nhis age is:"+john.getAge()
			+"\nhis address is:"+john.getAddress()
			+"\nhis name is:"+john.getName()
			+"\nhis phone number is:"+john.getPhNum()
		);
		
		john.ages();
		john.setAddress("730 Peachtree St., Suite 900 Atlanta, GA ");
		john.setPhNum("555-555-2450");
		System.out.println
		(
			"\nA Year has passed, and the person has changed. \nhis age is:"+john.getAge()
			+"\nhis address is:"+john.getAddress()
			+"\nhis name is:"+john.getName()
			+"\nhis phone number is:"+john.getPhNum()
		);
	}
} 
