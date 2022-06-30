package org.itmo.java.labs.fibonacci;

import java.util.Arrays;

public class Fibonacci {
    private static String fibonacciNumbers;

    private static void buildUpFibonacci () {
        Double [] fibonacciRow = new Double [150];
        fibonacciRow[0] = 0.0;
        fibonacciRow[1] = 1.0;
        for (int i=2; i<fibonacciRow.length; i++) {
            fibonacciRow[i] = fibonacciRow[i-1]+fibonacciRow[i-2];
        }
        System.out.println(Arrays.toString(fibonacciRow));
    }

    public static void main(String[] args) {
        buildUpFibonacci();
    }
}
