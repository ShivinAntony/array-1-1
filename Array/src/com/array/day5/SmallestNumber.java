package com.array.day5;

public class SmallestNumber {
	public static void main(String[] args) {
		
		int [] array = {43,34,30,64,23,12,45,12,23,22,22};
		int Samllest = 34;
		int Secondsmallest = 30;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<Samllest) {
				Secondsmallest = Samllest;
				Samllest = array[i];
			}else if(array[i]!=Samllest && array[i]<Secondsmallest) {
				Secondsmallest = array[i];
			}
		}
		System.out.println("Second Smallest :"+Secondsmallest);
		System.out.println("Smallest :"+Samllest);
	}

}
