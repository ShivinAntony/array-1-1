package com.array.day1;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};

        int secondLargest = findSecondLargest(numbers);

        System.out.println("The second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; // Return some default value or handle the case appropriately
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}