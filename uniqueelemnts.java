package arrays;
public class uniqueelemnts {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,3,7,6};
		printunique(a);
	}
	public static void printunique(int[] a) {
		for(int i=0;i<a.length;i++) {
	
				int c=0;
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						c++;
						
					}
				
			}
			if (c==1) {
					System.out.println(a[i]+",");
			}
		}
	}

}
	

