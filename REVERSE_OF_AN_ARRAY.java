package arrays;

import java.util.Arrays;

public class REVERSE_OF_AN_ARRAY {
	// REVERSE THE GIVEN ARRAY
	public static void main(String[] args) {
		int a[]= {5,10,3,4,6,7};
//		int res[] =new int[a.length];
//		int j=0;
//		for(int i=a.length-1;i>=0;i--) {
//			res[j]=a[i];
//					j++;
//		}
//		System.out.println(Arrays.toString(res));
//	}
		int i=0;
		int j=a.length-1;
		while(i<j) {
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
			
		
		}
		System.out.println(Arrays.toString(a));
		
	}

}
