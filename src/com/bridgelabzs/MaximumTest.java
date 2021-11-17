package com.bridgelabzs;

public class MaximumTest {
	
public Integer maximum (Integer a, Integer b ,Integer  c) {
		
		Integer max = c;
		
		if (a.compareTo(max) > 0)
			max = a;
		if (b.compareTo(max) > 0)
			max =b;
		
		return max;
	}
}
