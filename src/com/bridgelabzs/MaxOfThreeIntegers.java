package com.bridgelabzs;

import java.util.Scanner;

public class MaxOfThreeIntegers {

	public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
		T max = x; //x is largest
		
		if(y.compareTo(max) > 0)
			max = y; 	//y is largest
		
		if(z.compareTo(max) > 0)
			max = z; 	//z is largest

		return max;
	}	
		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the value of X :");
			int x = sc.nextInt();
			System.out.println("Enter the value of Y :");
			int y = sc.nextInt();
			System.out.println("Enter the value of Z :");
			int z = sc.nextInt();
			System.out.printf("Maximum of %d ,%d and %d is %d \n\n",x,y,z,maximum(x,y,z));		
			}
	}