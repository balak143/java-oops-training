package com.ion.training.oops.abstraction;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
        s1.area();
        s2.area();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
