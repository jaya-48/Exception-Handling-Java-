package org.example.Inheritance;

class Animal1 {

    void eat() {

        System.out.println("Animal is eating");
    }

}


// Child class 1
class Dog1 extends Animal1 {

    void bark() {

        System.out.println("Dog is barking");
    }

}


// Child class 2
class Cat extends Animal1 {
    void meow() {

        System.out.println("Cat is meowing");
    }

}


public class Hierarchi {

    public static void main(String[] args) {

        Dog1 d = new Dog1();

        d.eat();   // inherited method
        d.bark();  // Dog method


        Cat c = new Cat();

        c.eat();   // inherited method
        c.meow();  // Cat method

    }
}