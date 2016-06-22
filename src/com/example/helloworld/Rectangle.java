package com.example.helloworld;

/**
 * Created by davidhughes on 14/06/16.
 * Demo of dynamic method dispatch and method overriding.
 */
public class Rectangle extends Figure {

    //Constructor using parent class constructor
    Rectangle (double a, double b) {
        super (a,b);
    }

    //override the area method of superclass Figure
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
