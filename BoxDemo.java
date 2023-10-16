package Basic_OOPS;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box [] boxarr={new Box(),new Box(10),new Box(10,20),new Box(10,20,30)};
		for(int i=0;i<boxarr.length;i++)
		{
			boxarr[i].volume();
		}
		Box d1;
		   d1=new Box();
		   d1.volume();
		   
		   Box d2=new Box(9,9,9);
		   d2.volume();
		    
		   Box d3=new Box(9,9);
		   d3.volume();


	}

}
