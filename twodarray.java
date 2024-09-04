package arrays;

import java.util.Scanner;

public class twodarray {
	public static void main(String[] args) {
//		int [] [] a= {{1,2,3,9,8},{4,5,6},{7,8,9}};
//		for (int i=0;i<a.length;i++) {
//			for (int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j]+" ");
//				
//			}
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row number");
		int row=sc.nextInt();
		System.out.println("enter a col number");
		int col=sc.nextInt();
		
		int[][] a=new int[row][col];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print("enter the elements a["+i+"]["+j+"]:=>");
				a[i][j]=sc.nextInt();
			}
			
		}
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
