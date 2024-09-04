package arrays;

import java.util.Arrays;

public class sortan2darray {
	public static void main(String[] args) {
		int[][] a= {{5,6,3},{7,2,1},{8,9,-1}};
		System.out.println("before sort");
		for(int[] arr:a) {
			System.out.println(Arrays.toString(arr));
		}
		for(int i=0;i<a.length;i++) {
			bubblesort(a[i]);
		}
		System.out.println("after sorting");
		for(int[] arr:a) {
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void bubblesort(int[] a) {
		for (int i=0;i<a.length-1;i++) {
			for (int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					 
				}
		}
		
	}
}}
