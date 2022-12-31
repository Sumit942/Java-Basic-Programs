package com.demo.basicprograms;

public class Divisible {
	public static void main(String args[]) {
		int n =100;
		for(int i=1; i<=n; i++) {
			if((i%3==0) && (i%5==0)) {
				System.out.println(i+"divisible by 3 and 5");				
			}
			else if(i%5==0) {
				System.out.println(i+"divisible by 5");				
			}
			else if
			(i%3==0) {
				System.out.println(i+"divisible by 3");
				
			}
			else {
				System.out.println(i);
			}
		}
	}
}
