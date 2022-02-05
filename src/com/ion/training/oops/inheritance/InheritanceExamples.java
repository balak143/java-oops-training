package com.ion.training.oops.inheritance;

class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    Animal() {

    }

    protected void eat() {
        System.out.println(this.name + " - eating... ");
    }

    protected void sleep() {
        System.out.println(this.name + " - sleeping... ");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(this.name + " - Bow Bow ");
    }
}

class Cat extends Animal {
    Cat(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(this.name + " - Meow Meow... ");
    }
}

class Bird extends Animal {
    Bird(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(this.name + " - flying.. ");
    }
}

class Fish extends Animal {
    Fish(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(this.name + " - swimming.. ");
    }
}

class Chicken extends Bird{
    Chicken(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(this.name + " - is unable to fly");
    }
}
