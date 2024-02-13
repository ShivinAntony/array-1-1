package com.array.day2;

public class Patte {
	public static void main(String[] args) {
		System.out.println("SQUARE");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("PYRAMID");
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j>=n-(i-1)&&j<=n+(i-1)) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
