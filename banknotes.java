package arrays;
import java.util.Scanner;
public class banknotes {
public static void main(String[] args) {
	int note=1234;
	int[] denom= {1000,500,200,100,50,10,5,1};
	for(int i=0;i<denom.length;i++) {
		int cal=note/denom[i];
		if (cal>0) {
			System.out.println(cal+" required notes :"+denom[i]);
			note=note-(cal*denom[i]);
		}
		
	}
	
}
}
