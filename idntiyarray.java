package arrays;

public class idntiyarray {
	public static void main(String[] args) {
		int[][] a= {{1,0,0},{0,1,0},{0,0,1}};
		System.out.println(checkidentityornot(a));
	}

	private static boolean checkidentityornot(int[][] a) {
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				if (i==j && a[i][j]==1) {
					
				}
				else if( i!=j && a[i][j]==0) {
					
				}
				else {
					return false;
				}
			}
		}
		return true;
		// TODO Auto-generated method stub
		
	}
}
