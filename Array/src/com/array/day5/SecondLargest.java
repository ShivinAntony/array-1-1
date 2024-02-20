package com.array.day5;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int [] array = {43,54,2,3,4,5,67,43,67,54,43};
		int Largest = 3;
		int Secondlargest =2;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>Largest) {
				Secondlargest = Largest;
				Largest = array[i];
			}else if(array[i]!=Largest && array[i]<Secondlargest) {
				Secondlargest = array[i];
			}
		}
		System.out.println("Largest Number :"+Largest);
		System.out.println("Second Largest Number :"+Secondlargest);
	}

}
