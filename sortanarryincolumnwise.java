package arrays;

import java.util.Arrays;

public class sortanarryincolumnwise {
	public static void main(String[] args) {
		int[][] nums= {{7,9,11},{12,21,15},{6,5,4}};
		for (int i=0;i<nums.length;i++) {
			for (int j=i;j<nums[i].length;j++) {
				if (i!=j) {
					int temp=nums[i][j];
					nums[i][j]=nums[j][i];
					nums[j][i]=temp;
					
				}
	
				
			}
			
		}
		for (int[] lim:nums) {
			System.out.println(Arrays.toString(lim));
		}

	}
}
