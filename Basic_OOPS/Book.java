package Basic_OOPS;

public class Book {

	 public int bookid;
	 public double price;
	 public static int count;

		  static 
		  { 
		  count=0; 
		  System.out.println("Static Block"); 
		  }
		 
	 
	 public Book()
	 {
		bookid=count=0; 
		count++;
	 }
	 public Book(double price)
	 {
		 this.price=price;
		 count++;
	 }
	 public void Display()
	 {
		 System.out.println("Price:"+this.price);
	 }
	 public static void showCount()
	   {
		   System.out.println("Bookid is:"+count);
	   }

}
