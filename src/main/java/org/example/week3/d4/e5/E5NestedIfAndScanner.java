package org.example.week3.d4.e5;

import java.util.Scanner;

public class E5NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input

        // Print prompt for user to enter 3 distinct numbers separated by spaces

        // Capture the three numbers input

        // Use nested if-else statements to find the largest number

        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter three distinct numbers
        System.out.println("Please enter 3 distinct numbers separated by spaces");

        // Step 3: Capture the user's input
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Step 4: Use nested if-else statements to find the largest number
        int largest;

        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        // Step 5: Print the largest number
        System.out.println("The largest number is " + largest);

        // Step 6: Close the Scanner
        scanner.close();


    }
}
