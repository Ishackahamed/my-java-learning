package com.basiccodings.exceptionhandling;

public class Sample2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int sum = a + b;
            System.out.println(sum);
            int sub = a - b;
            System.out.println(sub);
            int mult = a * b;
            System.out.println(mult);

            // Division should be in a separate try block
            int divde = a / b;
            System.out.println("Division Result: " + divde);
            
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("Arithmetic operation completed.");
        }
    }
}
