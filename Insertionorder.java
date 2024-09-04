package arrays;

import java.util.Arrays;

public class Insertionorder {
	public static void main(String[] args) {
		int a[]= {9,2,1,4,6,-1};
		for(int i=1;i<a.length;i++) {
			int t=a[i];
			int j=i-1;
			while (j>=0 && t<a[j]) {
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=t;
			
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
