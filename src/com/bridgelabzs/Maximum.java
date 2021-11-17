package com.bridgelabzs;

import java.util.Scanner;

public class Maximum {

	public 	String  a;
	public 	String  b;
	public  String  c;
	
	public static void main(String[] args) {
		MaximumTest maxString = new MaximumTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String of a :");
		String a = sc.nextLine();
		System.out.println("Enter the String of b :");
		String b = sc.nextLine();
		System.out.println("Enter the String of c :");
		String c  = sc.nextLine();
		System.out.printf("maximum Number in %s,%s,%s is %s:", a,b,c,maxString.maximum(a, b, c));
	}
}
