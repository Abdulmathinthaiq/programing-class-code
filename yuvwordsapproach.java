package arrays;

import java.util.Scanner;

public class yuvwordsapproach {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ones[]= {"","one","two","three","four"," five"," six","seven","eight","nine","ten"};
		String elevn[]= {"","eleven","twelve","thirteen","fourteen","fiftin","sixtin","seventin","eightin","nintine"};
		String tens[]= {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty","hundred"};
		System.out.println("Enter a number");
		int n=sc.nextInt();
		String words="";
		while(n>0) {
			if (n<=10) {
				if (n==10) {
					words=words+" "+tens[n/10];
					n=n/100;
				}else {
					words=words+" "+ones[n];
					n=n/10;
				}
			}
			else if (n<=20) {
				if (n==20) {
					words=words+" "+tens[n/10];
					n/=100;
				}else {
					words=words+" "+elevn[n%10];
					n/=100;
				}
				
			}
			else if(n<=100) {
				if (n==100) {
					words=words+" "+ones[n/100]+" hundred";
					n=n%100;
				}
				else {
					words=words+" "+tens[n/10];
					n=n%10;
				}
			}
			else if( n<=999) {
				words=words+" "+ones[n/100]+" hundred";
				n=n%100;
			}
			else if( n<=10999) {
				if(n==10000) {
					words=words+" "+tens[n/10000]+" Thousand";
					n=n%10000;
				}
				else {
					words=words+" "+tens[n/10000]+" Thousand";
					n=n%10000;
				}
			}
			else if( n<=19999) {
				words=words+" "+elevn[(n/1000)%10]+" Thousand";
				n=n%1000;
			}
			else if( n<=99999) {
				words=words+" "+tens[n/10000]+" ";
				n=n%10000;
			}

	}
		System.out.println(words);
}}
