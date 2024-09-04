package arrays;

import java.util.Arrays;

public class primenumbers {
	public static void main(String[] args) {
		int n=5;
		int [] res=primen(n);
		System.out.println(Arrays.toString(res));
	} 
	public static int[] primen(int n) {
		int res[] =new int[n];
		int j=0;
		for(int i=1;n>0;i++) {
			int num=i;
			if (prime(num)) {
				//System.out.println(i);
				res[j]=i;
				j++;
				n--;
			}
		}
		return res;
		
		
	}
	public static boolean prime(int a) {
		int cf=0;
		for(int i=1;i<=a;i++) {
			if (a%i==0) {
				cf++;
			}
		}
		return cf==2;
		
	}

}
