package DayOne;

import java.util.Arrays;

public class Demo2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int a[]=new int[5]; //declaration and instantiation  
		a[0]=1; //initialization  
		a[1]=2;  
		a[2]=3;  
		a[3]=4;  
		a[4]=5; 

		int b[]= {4,2,3,7,5};
		//traverse through array
		int max=a[0];
		
		System.out.println();
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=b[i];
			}
			
		}
		System.out.println(max);
	}

}
