package arrays;

public class secondminvalue {
	public static void main(String[] args) {
		int array[]= {10,20,30,-1,-2,50};
		m1(array);
	}
	public static void m1(int[] a) {
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for (int i=0;i<a.length;i++) {
			if (min1>a[i])
			{
				min1=a[i];
			}
		}
		for (int i=0;i<a.length;i++) {
			if(min2>a[i] && min1!=a[i]) {
				min2=a[i];
			}
		}
		System.out.println(min1);
		System.out.println(min2);
	}
}
