package com.array.day1;

public class Array2ndLargestvalue {
	
	public static void main(String[] args) {
		
		int [] numbers= {47,3,37,12,46,47,5,64,21};
		
		int highest =0;
		int second_highest=0;
		for(int n :numbers) {
			if(highest < n) {
				second_highest = highest;
				highest=n;
			}else if(second_highest<n) {
				second_highest=n;
			}
		}
		System.out.println("Second Max Number: "+second_highest);
		System.out.println(highest);
	}
}
