package com.test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(BigInteger.valueOf(1002l));

    }





    public static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }


}
