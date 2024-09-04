package arrays;

import java.util.Arrays;

public class eachrowsum {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i=0;i<a.length;i++) {
			System.out.println((i+1)+" row sum :"+sumofrow(a[i]));
		}

	}

	private static int sumofrow(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	} 
}
