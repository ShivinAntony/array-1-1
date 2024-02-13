package com.array.day1;

public class Largest {
	
	public static int largestNumber(int [] array) {
		
		if(array.length<2) {
			System.out.println("invalid");
			return 0 ;
		}
		int n=array.length;
		int largest=10;
		for(int i=0;i<n;i++) {
			if(array[i]>largest) {
				largest =array[0];
			}
		}
		return largest;
		
	}
	
	public static void main(String[] args) {
		int [] arr= {10,3,12,23,5,54,33};
		int largestNo = largestNumber(arr);
		System.out.println("Largest No "+largestNo);
	}

}
