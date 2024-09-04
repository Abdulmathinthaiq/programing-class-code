package arrays;

import java.util.Arrays;

public class segrigationofevenandodd {
	public static void main(String[] args) {
		int [] a= {1,5,6,8,10,15,13,12};
		int res[]=new int[a.length];
		int ind=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
				res[ind]=a[i];
				ind++;
				
			}
		}
		for (int i=0;i<a.length;i++) {
			if (a[i]%2!=0) {
				res[ind]=a[i];
				ind++;
				
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
