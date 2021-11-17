package com.bridgelabzs;

import java.util.Scanner;

public class Maximum {

	public int a;
	public  int b;
	public  int c;
	
	public static void main(String[] args) {
		MaximumTest maxInt = new MaximumTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a = sc.nextInt();
		System.out.println("Enter the value of b :");
		int b = sc.nextInt();
		System.out.println("Enter the value of c :");
		 int c = sc.nextInt();
		System.out.printf("maximum Number in %d,%d,%d is %d:", a,b,c,maxInt.maximum(a, b, c));
	}
}
