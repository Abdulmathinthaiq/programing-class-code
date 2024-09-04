package arrays;

import java.util.Arrays;

public class spliting_disgitstonumber {
	public static void main(String[] args) {
		int a[]= {123,456,789,156};
		String s="";
		for(int ele:a) {
			s=s+ele;
		}
		System.out.println(s);
		int res[]=new int[s.length()];
		for(int i=0;i<res.length;i++) {
			res[i]=s.charAt(i)-48;
		}
		System.out.println(Arrays.toString(res));
	}

}
