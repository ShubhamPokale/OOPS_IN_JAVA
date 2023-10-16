package Basic_OOPS;

public class Box {
	int h,w,d;
	public Box()
	{
		h=10;
		w=15;
		d=5;
	}
	public Box(int h1 ,int d1, int w1)
	{
		h=h1;
		d=d1;
		w=w1;
	}
	public Box(int h)
	{
		this.h=h;
		this.d=h;
		this.w=h;
	}
	public Box(int d1, int w1)
	{
		h=10;
		d=d1;
		w=w1;
	}
	public void volume()
	{
		System.out.println("Volume of box :"+h*w*d);
	}


}
