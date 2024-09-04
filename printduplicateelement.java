package arrays;
public class printduplicateelement {
	public static void main(String[] args) {
		int a[]= {6,5,5,6,1,2,5,2};
		printDuplicate(a);
	}
	public static void printDuplicate(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MIN_VALUE) {
				int c=0;
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						c++;
						a[j]=Integer.MIN_VALUE;
					}
				}
				if (c>0) {
					System.out.println(a[i]+",");
				}
			}
		}
	}



}
