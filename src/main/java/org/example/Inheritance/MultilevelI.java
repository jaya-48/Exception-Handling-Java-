package org.example.Inheritance;

class Animal2 {

    void eat() {

        System.out.println("Eating...");
    }

}


// Child of Animal
class Dog2 extends Animal2 {
    public Dog2(){
        System.out.println("Dog constructor");
    }

    void bark2() {

        System.out.println("Dog is barking");
        super.eat();
    }

}


// Child of Dog
class Puppy extends Dog2 {
    public String s="puppy";
    public Puppy(){
        super();//Dog Constructor
        System.out.println("Puppy constructor");
    }
    public Puppy(String s){

        this();
        System.out.println("Puppy parametarized constructor");
    }


    void play2() {

        System.out.println("Puppy is playing");
    }

}


public class MultilevelI {

    public static void main(String[] args) {


        Puppy p = new Puppy("sweety");

        p.eat();  // Animal method
        p.bark2();  // Dog method
        p.play2();  // Puppy method

    }
}
