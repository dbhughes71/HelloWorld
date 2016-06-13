package com.example.helloworld;

/**
 * Created by davidhughes on 13/06/16.
 */
public class BoxWeight extends Box {
    double weight;

    //constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);  //Use super here to invoke the constructor of the super class of BoxWeight, i.e. Box's constructor.
        weight = m;
    }

    //construct clone of an object
    BoxWeight(BoxWeight ob) {
        super(ob);  //Passing a sub-class to a constructor of the super-class is permitted.  It will merely use the pieces of the subclass that it has.
        weight = ob.weight;
    }


    //default constructor
    BoxWeight() {
        super ();
        weight = -1;
    }
}
