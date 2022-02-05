package com.ion.training.oops.polymorphysm.z;

public class ParameterPoly {
}
class IntBox {
    private int contents;
    public IntBox() {
    }
    public void put(int t) {
        contents = t;
    }
    public int get() {
        return contents;
    }
}

class CharBox {
    private char contents;
    public CharBox() {}
    public void put(char t) {
        contents= t;
    }
    public char get() {
        return contents;
    }
}

class Box<T> {
    private T contents;
    public Box() {
    }
    public void put(T t) {
        contents = t;
    }
    public T get() {
        return contents;
    }
}

