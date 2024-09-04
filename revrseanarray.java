package arrays;

import java.util.Arrays;

public class revrseanarray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int res[]=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			res[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(res));
	}
}
