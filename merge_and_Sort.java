package arrays;

import java.util.Arrays;

public class merge_and_Sort {
	public static void main(String[] args) {
		int a[]= {10,15,16,19,20};
		int b[]= {1,5,6,17,18};
		int res[]=new int [a.length+b.length]	;
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			
			if(a[i] < b[j]) {
				//while(i<a.length) {
					res[k]=a[i];
					i++;
					k++;
				//}
			}
			else {
				res[k]=b[j];
				j++;
				k++;
			}
			
			
			
		}
		while(i<a.length) {
			res[k]=a[i];
			i++;
			k++;
		}
		while(i<b.length) {
			res[k]=b[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(res));
	}

}
