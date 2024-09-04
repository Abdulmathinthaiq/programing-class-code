package arrays;

import java.util.Arrays;

public class merg2rryinassorder {
	public static void main(String[] args) {
		int[] a= {1,2,20,30};
		int[] b= {10,15,16};
		int[] res=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while (i<a.length && j<b.length) {
			if(a[i]<b[i]) {
				res[k]=a[i];
				i++;
				k++;
			}
			else {
				res[k]=b[j];
				k++;
				j++;
			}
		}
			while(i<a.length) {
				res[k]=a[i];
				k++;
				i++;
			}
			while(j<b.length) {
				res[k]=b[j];
				k++;
				j++;
			}
			

		System.out.println(Arrays.toString(res));
	}
}
