package arrays;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		for (int [] arr:a) {
			System.out.println(Arrays.toString(arr));
		}
		for (int i=0;i<a.length;i++) {
			for (int j=i;j<a[i].length;j++) {
				if (i!=j) {
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
					
				}
	
				
			}
			
		}
		System.out.println("after transpose");
		for (int [] arr:a) {
			System.out.println(Arrays.toString(arr));
		}
		
		//m1(a);
		
	}

//	private static void m1(int[][] a) {
//		// TODO Auto-generated method stub
//		int[] []res=new int[a.length][a.length];
//		for (int i=0;i<a.length;i++) {
//			
//			for (int j=0;j<a[i].length;j++) {
//				res[j][i]=a[i][j];
//				
//			}
//		}
//		System.out.println(Arrays.deepToString(res));
//		
//	}
	
}
