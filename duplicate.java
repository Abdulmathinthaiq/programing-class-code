package arrays;

import java.util.Arrays;

public class duplicate {
	public static void main(String[] args) {
		int a[]= {6,5,5,6,1,2,5,2};
		int res[]=removeDuplicate(a);
		System.out.println(Arrays.toString(res));
			}
	public static int[] removeDuplicate(int [] a) {
		int count =0;
		for(int i=0;i<=a.length-1;i++) {
			if (a[i]!= Integer.MIN_VALUE) {
				for(int j=i+1;j<=a.length-1;j++) {
					if(a[i]==a[j]) {
						count++;
						a[j]=Integer.MIN_VALUE;
					}
				}
			}
			
		}
		//System.out.println(Arrays.toString(a));
		int res[] = new int[a.length-count];
		int k=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]!=Integer.MIN_VALUE) {
				res[k]=a[i];
				k++;
			}
			
		}
		return res;
		

	}

}
