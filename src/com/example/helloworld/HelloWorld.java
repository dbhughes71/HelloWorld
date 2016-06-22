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

        //Multidimensional arrays
        {
            int twoD[][] = new int[4][5];
            int k = 0;
            for (int i=0; i<4; i++){
                for (int j=0; j<5; j++) {
                    twoD[i][j]=k;
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        }

        //Multidimensional arrays with differing size secondary dimensions
        {
            int twoD[][] = new int[4][];
            twoD[0] = new int[1];
            twoD[1] = new int[2];
            twoD[2] = new int[3];
            twoD[3] = new int[4];
            int k=0;
            for (int i=0; i<4; i++){
                for (int j=0; j<i+1; j++){
                    twoD[i][j] = k;
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        }


        //Boolean Logical Operators
        {
            boolean a = true;
            boolean b = false;
            boolean c = a | b;  //logical OR
            boolean d = a & b;  //logical And
            boolean e = a ^ b;  //logical XOR
            boolean f = (!a & b) | (a & !b);
            boolean g = !a;
            System.out.println("    a = " + a);
            System.out.println("    b = " + b);
            System.out.println("  a|b = " + c);
            System.out.println("  a&b = " + d);
            System.out.println("  a^b = " + e);
            System.out.println("(!a & b) | (a & !b) = " + f);
            System.out.println("    !a = " + g);
        }

        //Ternary Operator '?'
        //The general form being: expression1 ? expression 2 : expression 3
        //where if expression1 is true then expression 2 is evaluated, else expression3
        {
            int i, k;
            i = 10;
            k = i < 0 ? -i : i;  //gets the absolute value of i
            System.out.print("Absolute value of ");
            System.out.println(i + " is " + k);
            i = -10;
            k = i < 0 ? -i : i;  //gets the absolute value of i
            System.out.print("Absolute value of ");
            System.out.println(i + " is " + k);
        }

        //Switch Statement with and without break statement
        {
            for (int i=0;i<12;i++)
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("i is less than 5");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println("i is less than 10");
                        break;
                    case 10:
                    default:
                        System.out.println("i is 10 or more");
                }
        }


        //Iteration statements
        {
            //WHILE
            int n = 10;
            while (n>0){
                System.out.println("tick " + n);
                n--;
            }

            //DO WHILE
            n = 0;
            do {
                System.out.println("tick " + n);
                n++;

            } while (n<11);

            //FOR loop with multiple variables
            int a,b;
            for (a=1, b=4; a<b; a++, b--) {
                System.out.print("a = " + a);
                System.out.println(",  b = " + b);
            }

            //FOR EACH loop
            int nums[] = {1,2,3,4,5,6,7,8,9,10};
            int sum = 0;
            for (int x: nums) {
                sum += x;
                System.out.println("Value is: " + x + " : Summation so far is " + sum);
                if (x==5) break;  //terminate the for-loop when the loop reaches 5th iteration.
            }
            System.out.println("Summation: " + sum);
        }



        //Boxdemo3
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);



        //Stack Demo
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //push some numbers onto the stack
        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=10; i<20; i++) mystack2.push(i);

        //pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2:");
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop());


        //Overloading methods demo
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);  //this will invoke test(double) even though i is an integer
        ob.test(123.2);   //this will invoke test(double)


        //Demo 'pass-by-reference' when objects are passed as parameters to methods
        Test ob1 = new Test (15,20);
        System.out.println("ob1.a and ob1.b before call: " + ob1.a + " " + ob1.b);
        ob1.meth(ob1);   //Here ob1 is passed-by-reference to the ob1.meth method
        System.out.println("ob1.a and ob1.b after call: " + ob1.a + " " + ob1.b);  //Observe how ob1's instance variables were permanently affected by the ob1.meth invocation.


        //Demo recursion
        Factorial f = new Factorial();
        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
        System.out.println("Factorial of 5 is " + f.fact(5));



        //Demo inheritance.  BoxWeight extends Box by adding Weight instance variable.
        //Also demonstrates the use of super to access super-class Box's constructor
        BoxWeight myboxW1 = new BoxWeight(10,20,15,32.3);
        BoxWeight myboxW2 = new BoxWeight(2, 3, 4, 0.076);

        vol = myboxW1.volume();
        System.out.println("Volume of myboxW1 is " + vol);
        System.out.println("Weight of myboxW1 is " + myboxW1.weight);

        vol = myboxW2.volume();
        System.out.println("Volume of myboxW2 is " + vol);
        System.out.println("Weight of myboxW2 is " + myboxW2.weight);


        //Demo of dynamic method dispatch and method overriding (including abstract class)
        //Figure fig = new Figure (10,10);  This is now illegal since Figure is an abstract class
        Rectangle rec = new Rectangle (9,5);

        Triangle tri = new Triangle (10,8);
        Figure figref;

        figref = rec;
        System.out.println("Area is " + figref.area());  //observe how a single interface is achieved for multiple types of objects.

        figref = tri;
        System.out.println("Area is " + figref.area());


        //Demo of a class implementing an interface
        Client c = new Client();
        c.callback(6);   //this method implements the interface Callback
        c.nonIfaceMeth();  //this is another member of class Client that doesn't implement an interface

        //Demo of an object reference using the interface rather than a class type
        Callback cb = new Client();  //Here c is an interface type that is referencing a new object of type Client.  This is permitted because Client implements the Callback interface
        cb.callback(6);   //this method implements the interface Callback and is therefore accessible to object c
        //c.nonIfaceMeth();  //this is illegal since object c is of an interface that doesn't specify this method.


        //Demo of interfaces used on the stack example
        FixedStack mystack3 = new FixedStack(5);
        FixedStack mystack4 = new FixedStack(8);
        //push some numbers onto the stacks
        for (int j=0;j<5;j++) mystack3.push(j);
        for (int j=0;j<8;j++) mystack4.push(j);
        //pop those numbers off the stack
        System.out.println("Stack in mystack3:");
        for(int j=0; j<5; j++) System.out.println(mystack3.pop());
        System.out.println("Stack in mystack4:");
        for(int j=0; j<5; j++) System.out.println(mystack4.pop());

    }

}

