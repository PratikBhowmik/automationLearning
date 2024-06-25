package myPackage.Pages;

import groovyjarjarantlr4.runtime.misc.IntArray;

public class BackbaseJavaproblem1 {

    // Find the 3rd largest number in an array
    // Approaches brute better optimal
    // Optimal solution
    
    public static int function(int[] arr) {

        if (arr.length < 3) {
            System.out.println("Invalid input");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num < secondLargest) {
                thirdLargest = num;
            }
        }
        return thirdLargest;
    }

}
