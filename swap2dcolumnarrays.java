package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swap2dcolumnarrays {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter The First row");
	      int c1=sc.nextInt();
	      System.out.println("Enter The Second row");
	      int c2=sc.nextInt();
	      int[][] nums= {{1,2,3},{4,5,6},{7,8,9}};
	      System.out.println("++++++++++++++++before swap+++++++++++++++++++++++++");
	      for(int[] arr:nums) {{
	    	  System.out.println(Arrays.toString(arr));
	      }
	    
	    	 if(c1>=0 && c2>=0 && c1<nums.length &&c2<nums.length) {
	    		 for (int i=0;i<nums.length;i++) {
	    			  int temp=nums[i][c1];
	        		  nums[i][c1]=nums[i][c2];
	        		  nums[i][c2]=temp;
	    		 }
	    	  }
	      else {
	      System.out.println("invalid rows");
	      }
	    	
	   
	     System.out.println("++++++++++++++++After swap+++++++++++++++++++++++++");
	      for(int[] arr1:nums) {
	    	  System.out.println(Arrays.toString(arr1));
	      }
	      
	    }
}
}