package arrays;
import java.util.Scanner;

public class averagesumofelement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number below");
		int size=sc.nextInt();
		int[] array=new int[size];
		for (int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		m1(array);
	}
	public static void m1(int[] a) {
		int sum=0;
		@SuppressWarnings("unused")
		int count=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
			count++;
		}
		System.out.println("average of the number ==>"+sum/a.length);
	}

}
