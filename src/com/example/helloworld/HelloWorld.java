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
        {
            int x, y;
            x = 10;
            y = 20;
            if (x < y) System.out.println("x is less than y");
            x = x * 2;
            if (x == y) System.out.println("x now equal to y");
            x = x * 2;
            if (x > y) System.out.println("x is greater than y");
            if (x == y) System.out.println("x now equal to y");
        }

        //For loop sample code
        {

            for (int x = 0; x < 10; x = x + 1)
                System.out.println("This is x: " + x);
        }

        //Compute the area of a circle
        {
            double pi, r, a;
            r = 10.8;
            pi = 3.1416;
            a = pi * r * r;
            System.out.println("Area of the circle is " + a);
        }

        //Demonstrate char data type.
        {
            char ch1, ch2;
            ch1 = 88;  //code for X
            ch2 = 'Y';
            System.out.println("ch1 and ch2: ");
            System.out.println(ch1 + " " + ch2);
        }

        //Demonstrate block scope
        {
            int x;
            x = 10;
            if (x == 10) {
                int y = 20;
                System.out.println("x and y:" + x + " " + y);
                x = y * 2;
            }
            //y = 100;
            System.out.println("x is " + x);
        }

        //Demonstrate type promotion rules
        {
            byte b = 42;
            char c = 'a';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = 0.1234;
            double result = (f * b) + (i / c) - (d * s);
            System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
            System.out.println("result = " + result);
        }

        //Demonstrate one-dimensional arrays
        {
            int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
            System.out.println("April has " + month_days[3] + " days.");
        }
    }

}

