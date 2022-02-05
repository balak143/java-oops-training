package com.ion.training.oops.polymorphysm.z;

/**
 * plus sign (+)
 */
public class OperatorOverloading {
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public String add(String a,String b){
        return a.concat(b);
    }

}
