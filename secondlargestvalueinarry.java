package arrays;

public class secondlargestvalueinarry {
	public static void main(String[] args) {
		int array[]= {10,20,30,-1,-2,50};
		m1(array);
	}
	public static void m1(int[] a) {
		int min1=Integer.MIN_VALUE;
		int min2=Integer.MIN_VALUE;
		for (int i=0;i<a.length;i++) {
			if (min1<a[i]) {
				min1=a[i];
				
			}
			
			
		}
		for (int i=0;i<a.length;i++) {
			if (min2<a[i] && min1!=a[i]) {
				min2=a[i];
				
			}
			
			
		}
		
		System.out.println("the first max element is "+min1);
		System.out.println("the second max element is "+min2);
	}
}
