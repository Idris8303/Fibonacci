package com.tiy;
import java.math.BigInteger;
import java.util.HashMap;


public class Main {
    static HashMap<Integer, BigInteger> fibonacciNums = new HashMap<>();

//    public static void initMap () {
//        fibonacciNums.put(0, 0l);
//        fibonacciNums.put(1, 1l);
//    }

    public static BigInteger calcFibonacci (int index) {
        if (fibonacciNums.containsKey(index)) {
            return fibonacciNums.get(index);
        }
        BigInteger response = calcFibonacci(index - 1).add(calcFibonacci(index - 2));
        fibonacciNums.put(index, response);
        return response;
    }

    public static void main(String[] args) {
//        initMap();

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 200; i++) {
            System.out.println("calc(" + i + ") = " + calcFibonacci(i));
        }
        endTime = System.currentTimeMillis();

        System.out.println(" Fibonacci numbers took " + (endTime - startTime) + " milliseconds");

    }

}
