package arrays;

import java.util.Scanner;

public class evenelements {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an arry");
		int size=sc.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		even(arr);
	}
	public static void even(int [] a) {
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}
