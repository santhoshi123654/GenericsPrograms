package com.bridgelabzs;

import java.util.Scanner;

public class Maximum {

	public 	float a;
	public  float b;
	public  float c;
	
	public static void main(String[] args) {
		MaximumTest maxFloat = new MaximumTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		float a = sc.nextFloat();
		System.out.println("Enter the value of b :");
		float b = sc.nextFloat();
		System.out.println("Enter the value of c :");
		float c = sc.nextFloat();
		System.out.printf("maximum Number in %f,%f,%f is %f:", a,b,c,maxFloat.maximum(a, b, c));
	}
}
