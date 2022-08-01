package com.java.fibonacci;

public class Fibonacci {

    static Long fib(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (Long) Math.round(Math.pow(phi, n)
                / Math.sqrt(5));
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 76;
        long preTime=System.currentTimeMillis();
        System.out.println(fib(n));
        long postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));

    }
}

