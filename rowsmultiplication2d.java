package arrays;

import java.util.Arrays;

public class rowsmultiplication2d {
	public static void main(String[] args) {
	     
	      int[][] nums= {{1,2},{2,1}};
	      int[][] nums1= {{1,2},{2,1}};
	      int[][] res= new int[nums.length][nums1.length];
	     
	      System.out.println("++++++++++++++++After rows multiiplicatio+++++++++++++++++++++++++");
	    
	      for(int i=0;i<nums.length;i++) {
	    	  for (int j=0;j<nums1[0].length;j++) {
	    		  for(int k=0;k<nums.length;k++) {
	    			  res[i][j]+=nums[i][k]*nums1[k][j];
	    		  }
	    	  }
	      }
	      for (int[] arr:res) {
	    	  System.out.println(Arrays.toString(arr));
	      }
	}
}
