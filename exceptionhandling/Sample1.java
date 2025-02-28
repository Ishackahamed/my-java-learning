package com.basiccodings.exceptionhandling;

public class Sample1 {

    public static void main(String[] args) {
        try {
            int i = 100;
            int j = 0;

            // Division by zero will cause an exception
            int result = i / j;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
