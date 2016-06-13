package com.example.helloworld;

/**
 * Created by davidhughes on 13/06/16.
 */
public class Box {
    double width;
    double height;
    double depth;


    //constructor
    Box(double width, double height, double depth) {
        System.out.println("Constructing Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    //calcs the volume
    double volume () {
        return width * height * depth;
    }

    //sets the instance variables
    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
