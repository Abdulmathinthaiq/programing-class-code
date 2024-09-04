package arrays;

public class binarysearch {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,70,80,90};
	int ele=70;
	boolean flag=binarySearch(a,ele);
	if (flag==true) {
		System.out.println("ele found");
	}
	else {
		System.out.println("ele not found");
	}
	
}
public static boolean binarySearch(int[] a, int ele) {
	int l=0;
	int h=a.length-1;
	//boolean fig = false;
	while(l<=h) {
		int mid=(l+h)/2;
		if (a[mid]==ele) {
		return true;
		
		}
		else if(ele>a[mid]){
			l=mid+1;
			
		}
		else if(a[mid]>ele) {
			h=mid-1;
		}
		
	}
	return false;

}
}
