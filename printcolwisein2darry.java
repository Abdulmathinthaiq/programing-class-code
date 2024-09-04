package arrays;

public class printcolwisein2darry {
	public static void main(String[] args) {
		int [][] a= {{3,4,1,5},{6,2,7,4},{15,12,17},{19,20,15}};
		for (int i=0;i<a.length;i++) {
			int max=Integer.MIN_VALUE;
			for (int j=0;j<a.length;j++) {
				if(max<a[j][i]) {
					max=a[j][i];
				}
			}
			System.out.println((i+1)+" col max element is : "+max);
		}
		
	}
}




