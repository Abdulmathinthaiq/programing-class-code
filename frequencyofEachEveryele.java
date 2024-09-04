package arrays;

public class frequencyofEachEveryele {
	public static void main(String[] args) {
		int a[]= {1,5,6,1,1,2,2,5};
		for (int i=0;i<a.length;i++) {
			int c=1;
			if(a[i]!=-1) {
				for (int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						c++;
						a[j]=-1;
					}
				}
				System.out.println(a[i]+" ==> "+c);
			}
		}
	}

}
