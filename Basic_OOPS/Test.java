package Basic_OOPS;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		System.out.println(s1.id);
		s1.show();
		Date d1;
		   d1=new Date();
		   d1.showDate();
		   
		   Date d2=new Date(21,3,2007);
		   d2.showDate();
		   
		   Date d3;
		   d3= new Date();
		   d3.showDate('-');
		   Date.showCount();


	}

}
