package arrays;

import java.util.Arrays;
import java.util.Random;

public class merge01usingrandom {
	public static void main(String[] args) {
		Random ran=new Random();
		System.out.println("Enter the size of an array");
		int size=ran.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<arr.length;i++) {
			
			arr[i]=ran.nextInt(2,100);
			System.out.println(arr[i]);
		}
		System.out.println((arr));
	}
}
