package com.bridgelabzs;

public class MaximumTest {
	
public Float maximum (Float a, Float b ,Float  c) {
		
		Float max = a;
		
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max =c;
		
		return max;
	}
}
