package com.array.day1;

public class Large {
	public static void main(String[] args) {
		int [] a= {16,5,16,2,3,13,16,13,13};
	int	largest =-2000;
		int secondlargest= -3000;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secondlargest=largest;
				largest=a[i];
			}else if(a[i]!=largest && a[i]>secondlargest) {
				secondlargest =a[i];
			}
		}
		System.out.println("first largest no  " +largest);
		System.out.println("Second largest no  "+secondlargest);
	}

}

//reapeated no ok annu