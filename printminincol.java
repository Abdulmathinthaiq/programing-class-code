package arrays;

public class printminincol {
	public static void main(String[] args) {
		int [][] a= {{3,4,1,5},{6,2,7,4},{15,12,17,10},{19,20,15,12}};
		for (int i=0;i<a.length;i++) {
			int min=Integer.MAX_VALUE;
			for (int j=0;j<a.length;j++) {
				if(min>a[j][i]) {
					min=a[j][i];
				}
			}
			System.out.println((i+1)+" col min element is : "+min);
		}
		
	}
}
