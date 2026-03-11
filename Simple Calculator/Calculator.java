// This program takes user input to use the calculator. 
// There are four functions: addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello user!! Welcome to the simple calculator.");
        System.out.println("What is the first and second number to be used?");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Please select the number to use the function:");
        System.out.println("1. Addition, 2. Subtraction, 3. Multiplication, 4. Division");
        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("Your answer is: " + add(a, b));
        } else if (choice == 2) {
            System.out.println("Your answer is: " + subtract(a, b));
        } else if (choice == 3) {
            System.out.println("Your answer is: " + multiply(a, b));
        } else {
            System.out.println("Your answer is: " + divide(a, b));
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
