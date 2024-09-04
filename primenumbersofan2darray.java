package arrays;

public class primenumbersofan2darray {

	public static void main(String[] args) {
		int[][] nums= {{7,9,11},{12,21,15},{6,5,4}};
		int count=0;
		for (int i=0;i<nums.length;i++) {
			
			for (int j=0;j<nums.length;j++) {
				if(nums[i][j]%2==0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
