package com.example.helloworld;

/**
 * Created by davidhughes on 13/06/16.
 */
public class Test {
    int a,b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    //pass an object
    void meth(Test o) {
        o.a *= 2;   // o.a = o.a * 2;
        o.b /= 2;
    }

}
