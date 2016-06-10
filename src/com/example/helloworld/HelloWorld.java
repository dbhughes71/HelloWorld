package com.example.helloworld;

/**
 * Created by davidhughes on 4/06/16.
 *
 * This project will be used to explore IntelliJ IDE and GitHub
 */
public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        //If statements sample
        int x,y;
        x = 10;
        y = 20;
        if (x<y) System.out.println("x is less than y");
        x=x*2;
        if (x==y) System.out.println("x now equal to y");
        x=x*2;
        if (x>y) System.out.println("x is greater than y");
        if (x==y) System.out.println("x now equal to y");

        //For loop sample code
        for(x=0;x<10;x=x+1)
            System.out.println("This is x: " + x);
    }
}
