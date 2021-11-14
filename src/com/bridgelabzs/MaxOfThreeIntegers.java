package com.bridgelabzs;

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
			System.out.printf("Maximum of %d ,%d and %d is %d \n\n",5,2,1,maximum(3,4,5));
	
		}
}
