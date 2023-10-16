package DayOne;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int arr[]= {32,23,43,2,5,29};// declaration & initializatio
		int index=-1;
/* Traversing array*/for(int i=0;i<arr.length;i++) {
			index=i;
/*comparing values*/for(int j=i;j<=arr.length-1;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+",");
		}
	}

}
