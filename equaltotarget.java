package arrays;

import java.util.Arrays;
import java.util.Scanner;

//sum of sub array is equal to equal to target
public class equaltotarget {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		int target=sc.nextInt();
		int res[]=sumEqualtotarget(a,target);
		System.out.println(Arrays.toString(res));
	}
		public static int[] sumEqualtotarget(int[] a,int target) {
		for (int i=0;i<a.length;i++) {
			for (int j=i;j<a.length;j++) {
				int sum=0;
				for (int k=i;k<=j;k++) {
					//System.out.print(a[k]+" ");
					sum=sum+a[k];
				}
				System.out.println(" ");
				if (target==sum) {
					return new int[] {i,j};
							}
			}
		}
		return new int[] {-1,-1};
		}
		

	}

