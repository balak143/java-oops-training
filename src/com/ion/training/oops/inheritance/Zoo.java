package com.ion.training.oops.inheritance;

class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.eat();
        animal.sleep();
        System.out.println("====================");
        Dog dog = new Dog("Golden Retriever");
        dog.bark();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat("American shorthair");
        cat.eat();
        cat.bark();
        Bird bird = new Bird("Sparrow");
        bird.fly();
        Fish fish = new Fish("Pomfret");
        fish.swim();

        if (dog instanceof Animal){

        }
        if(dog instanceof Dog){

        }

    }
}
