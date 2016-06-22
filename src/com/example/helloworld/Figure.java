package com.example.helloworld;

/**
 * Created by davidhughes on 14/06/16.
 * Demo of dynamic method dispatch and method overriding
 */
abstract class Figure {
    double dim1;
    double dim2;


    //constructor
    Figure (double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    //area is an abstract method that must be implemented by classes derived from Figure
    abstract double area();
}
