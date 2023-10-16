package Basic_OOPS;

public class Book1 {
	int id;
	String Book_name;
	int price;
	
	
	
	public Book1(int id, String book_name, int price) {
		
		this.id = id;
		Book_name = book_name;
		this.price = price;
	}



	public Book1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args)
	{
		Book1 b1;
		b1=new Book1();
		//b1.show();
		
	}

}
