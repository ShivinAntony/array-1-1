package com.array.day4;

public class Largest {
	public static void main(String[] args) {
		
		int [] array= {2,3,4,23,43,56,2,49};
		int largest =3;
		int secondlargest =2;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				secondlargest =largest;
				largest = array[i];
			}else if (array[i]!=largest&&array[i]>secondlargest) {
				secondlargest = array[i];
			}
		}
			System.out.println("Largest Number :"+largest);
			
			System.out.println("Second Largest Number :"+secondlargest);
		
	}

}
