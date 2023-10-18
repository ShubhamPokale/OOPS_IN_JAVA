package Basic_OOPS;

public class Book2 {
	int bookid;
	String name;
	double price;
	
	
	public Book2() {
		bookid=0;
	}

	public Book2(int bookid, String name, double price) {
		this.bookid = bookid;
		this.name = name;
		this.price = price;
	}
	
	public Book2(double price) {
		this.price=price;
	}
	
	public void Display() {
		System.out.println("Price is:"+this.price);
	}
	

}
