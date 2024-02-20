package com.array.day5;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int [] array = {2,1,5,3,7,6};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			
			}
		
			
			
	}
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
	}
}
}