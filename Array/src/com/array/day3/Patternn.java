package com.array.day3;

public class Patternn {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Star");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("STAR");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("OTHER SIDE");
		
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j < i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = i; k <= 5; k++) {
		        System.out.print(" *");
		    }
		    System.out.println();
		}

	System.out.println("CHANGE");


	   
	        int rows = 5; // Define the number of rows

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces before stars
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	        System.out.println("INVERSTED");
	    
	int row =5;
	for (int i = row; i >= 1; i--) {
        // Print spaces before numbers
        for (int j = 1; j <= row - i; j++) {
            System.out.print(" ");
        }

        // Print numbers
        for (int j = i; j <= row; j++) {
            System.out.print("* ");
        }

        // Move to the next line
        System.out.println();
    }

	}

}
