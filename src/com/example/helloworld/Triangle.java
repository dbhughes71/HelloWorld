package com.example.helloworld;

/**
 * Created by davidhughes on 14/06/16.
 */
public class Triangle extends Figure {
    Triangle (double a, double b) {
        super (a, b);
    }

    //override the area method of superclass Figure
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
