package arrays;

public class minElement {
	public static void main(String[] args) {
		int array[]= {10,20,30,-1,-2,50};
		m1(array);
	}
	public static void m1(int[] a) {
		int min=0;
		for(int i=0;i<a.length;i++) {
			if (min>a[i]) {
				min=a[i];
				System.out.println(min);
			}
			}
		}
}
