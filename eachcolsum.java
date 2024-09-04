package arrays;

public class eachcolsum {
	
		public static void main(String[] args) {
			int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
			sumofrow(a);
		}

		private static void sumofrow(int[][] a) {
			
			
			for (int i=0;i<a.length;i++) {
				int sum=0;
				for (int j=0;j<a[i].length;j++) {
					sum=sum+a[j][i];
					
				}
				System.out.println((i+1)+" the sum of column"+sum);
			}
			
		} 
	

}
