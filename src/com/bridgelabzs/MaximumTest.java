package com.bridgelabzs;

public class MaximumTest {
	
public Integer maximum (Integer a, Integer b ,Integer  c) {
		
		Integer max = b;
		
		if (c.compareTo(max) > 0)
			max = c;
		if (a.compareTo(max) > 0)
			max =a;
		
		return max;
	}
}
