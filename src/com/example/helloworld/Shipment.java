package com.example.helloworld;

/**
 * Created by davidhughes on 13/06/16.
 */
public class Shipment extends BoxWeight {
    double cost;

    Shipment (Shipment ob) {//pass object to constructor to clone
        super (ob);
        cost = ob.cost;
    }


    Shipment (double w, double h, double d, double m, double c) {
        super (w, h, d, m);
        cost = c;
    }


    Shipment () {
        super();
        cost = -1;
    }
}
