package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swap2drowarrays {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter The First row");
	      int r1=sc.nextInt();
	      System.out.println("Enter The Second row");
	      int r2=sc.nextInt();
	      int[][] nums= {{1,2,3},{4,5,6},{7,8,9}};
	      for(int[] arr:nums) {{
	    	  System.out.println(Arrays.toString(arr));
	      }
	      if(r1>=0 && r2>=0 && r1<nums.length && r2<nums.length) {
	    		  int[] temp=nums[r1];
	    		  nums[r1]=nums[r2];
	    		  nums[r2]=temp;
	    	  }
	      else {
	      System.out.println("invalid rows");
	      }
	      for(int[] arr1:nums) {
	    	  System.out.println(Arrays.toString(arr1));
	      }
	      
	    }}

}
