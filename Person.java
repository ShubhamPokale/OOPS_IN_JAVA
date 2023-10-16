package Basic_OOPS;

public class Person {
	private String name;
	private Date bdate;
	
	
	public Person()
	{
		this.name=new String(" ");
		this.bdate=new Date();
		
	}
	public Person(String name,int dd, int mm, int yy)
	{
		this.name=name;
		this.bdate=new Date(dd,mm,yy);
	}
	public void Display()
	{
		System.out.println("Name: "+this.name);
		if (bdate!=null)
		{
			System.out.println("Birthdate:");
			bdate.showDate();
		}
		
	}

}
