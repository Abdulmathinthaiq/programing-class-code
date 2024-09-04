package arrays;

import java.util.Arrays;

public class merge {
	public static void main(String[] args) {
		int a[]= {10,15,16,19,20};
		int b[]= {1,5,6,17,18};
		int[] res=new int [a.length+b.length];
		int j=0,k=0;
		for (int i=0;i<res.length;i++) {
			 if(i<a.length) {
				 res[i]=a[i];
			 }
			 else {
				 res[i]=b[j];
				 j++;
			 }
		}
		System.out.println(Arrays.toString(res));
	}

}
