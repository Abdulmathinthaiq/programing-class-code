package arrays;

import java.util.Arrays;

public class reverseofaneachandeveryrow {
	public static void main(String[] args) {
		  int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		  for(int i=0;i<a.length;i++) {
			  reverse(a[i]);
		  }
		  for (int [] arr:a) {
			  System.out.println(Arrays.toString(arr));
		  }
	}

	private static void reverse(int[] a) {
		// TODO Auto-generated method 
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}	
	}

}
