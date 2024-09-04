package arrays;

import java.util.Arrays;

public class zigzagnumber {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6,7,8,9};
		int[] res=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while (k<res.length) {
			if (i<a.length) {
				res[k]=a[i];
				k++;
				i++;
			}
			if (j<b.length) {
				res[k]=b[j];
				k++;
				j++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
