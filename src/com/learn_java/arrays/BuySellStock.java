package com.learn_java.arrays;

public class BuySellStock {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,9};
		int minPrice = prices[0];
		int maxProfit =Integer.MIN_VALUE;
		for(int i=1;i<prices.length;i++){
			int currentPrice = prices[i];
			maxProfit = Math.max(currentPrice-minPrice,maxProfit);
			minPrice = Math.min(currentPrice,minPrice);
		}
		System.out.println("maxProfit:"+maxProfit);
	}
}
