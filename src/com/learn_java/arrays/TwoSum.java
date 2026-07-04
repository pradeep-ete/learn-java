package com.learn_java.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15, 3, 13 };
		int target = 10;
		Map<Integer,Integer>  freq = new HashMap<>();
		int i=0;
		for(int ele:arr){
			if (freq.containsKey(target-ele)) {
				System.out.println("found at index" + freq.get(target-ele) + "," + i);
				return;
			} else {
				freq.put(ele,i);
			}
			i++;
		}
	}
}
