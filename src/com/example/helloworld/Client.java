package com.example.helloworld;

/**
 * Created by davidhughes on 22/06/16.
 * Demonstrates the implementation of interfaces
 */
public class Client implements Callback {

    //Implement Callback's interface
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");
    }
}
