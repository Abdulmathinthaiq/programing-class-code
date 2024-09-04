package arrays;

public class minineachrow2d {

		public static void main(String[] args) {
			int[][] a= {{5,1,4,3},{6,2,7,4},{5,12,17,5},{19,20,15,16}};
			maxelem(a[0]);
			for (int i=0;i<a.length;i++) {
				System.out.println((i+1)+" row max element is : "+maxelem(a[i]));
			}
		}

		private static int maxelem(int[] a) {
			// TODO Auto-generated method stub
			int max =Integer.MAX_VALUE;
			for (int i=0;i<a.length;i++) {
				if (max>a[i]) {
					max=a[i];
					
				}
			}
			return (max);
			
		}

}
