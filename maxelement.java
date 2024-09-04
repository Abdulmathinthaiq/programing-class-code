package arrays;

public class maxelement {
	public static void main(String[] args) {
		int array[]= {10,20,30,-1,-2,50};
		m1(array);
	}
	public static void m1(int [] a) {
		int max=0;
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
