package com.demo.basicprograms;

import java.util.Scanner;
/**
 * 
 * @author Sumit
 *
 */
public class E3_BinaryToDec {

	/**
	 * @param args
	 * @author Sumit
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary Number: ");
		String input = sc.nextLine();

		int count = 0, indexValue = 1, flag = 0;
		String binCheck = String.valueOf(input);
		for(int i = 0; i < binCheck.length(); i++) {
			if(!(binCheck.charAt(i) != '1' || binCheck.charAt(i) != '0')) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("Not a binary Number: "+input);
			return;
		}
		
		long decimal = 0, binary = Long.parseLong(input);
		while (binary != 0) {
			int bit = (int) (binary % 10);
			if (bit == 1) {
				for (int i = 0; i < count; i++) {
					if (count != 0) {
						indexValue *= 2;
					}
				}
				decimal += indexValue;
				indexValue = 1;
			}
			binary /= 10;
			count++;
		}

		System.out.println("Decimal Value: " + decimal);
		sc.close();
	}
	
	/**
	 * @author divScorps
	 */
	public static void main1(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary no. - ");
        String bin=sc.nextLine();
        int flag=1;
        long dec=0,num;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'|| bin.charAt(i)=='0')
                flag=1;
            else 
                flag=0;
        }
        if(flag==0){
            System.out.println("Not a valid Binary Number!!!!");
        } else {
        	num = Long.parseLong(bin);
        	for(int i = 0; i < bin.length(); i++) {
        		dec+= ((num % 10)*Math.pow(2, i));
        		num /= 10;
        	}
        	System.out.println("Decimal Number is : "+dec);
        }
        sc.close();
	}
}
