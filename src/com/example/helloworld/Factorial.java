package com.example.helloworld;

/**
 * Created by davidhughes on 13/06/16.
 */
public class Factorial {
    //this is a recursive method

    int fact(int n) {
        int result;
        System.out.println("Entering at" + n + "...");
        if(n==1) return 1;
        result = fact(n-1)*n;
        System.out.println("Resolving at" + n + "..." + result);
        return result;
    }
}
