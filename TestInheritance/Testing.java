package TestInheritance;

public class Testing extends Truck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//vehicle method + Car method + Truck method
		//we were able to call all methods of Class Vehicle,Car & Truck.
		Testing t=new Testing();
		t.heavyV();
		t.fourWheeler();
		t.bike();
	}

}
