package Basic_OOPS;

public class Book2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book2 b1=new Book2();
		b1.Display();
		Book2 b2=new Book2(121,"C++",330.0);
		System.out.println(b2.bookid+b2.name+b2.price);
		Book2 b3=new Book2(270.0);
		b3.Display();
		Book b4=new Book();
		b4.Display();
		b4.showCount();
	}

}
