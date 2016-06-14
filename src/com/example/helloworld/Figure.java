package com.example.helloworld;

/**
 * Created by davidhughes on 14/06/16.
 * Demo of dynamic method dispatch and method overriding
 */
public class Figure {
    double dim1;
    double dim2;

    Figure (double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area () {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}
