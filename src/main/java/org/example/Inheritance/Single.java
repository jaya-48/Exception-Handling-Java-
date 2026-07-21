package org.example.Inheritance;

class Animal {

    void eat(){

        System.out.println("Eating...");
    }
    void drink(){

        System.out.println("drinking...");
    }
}


class Dog extends Animal {

    @Override
    void eat(){
        System.out.println("Eating2...");
        super.drink();
    }

    void bark(){

        System.out.println("Barking...");
    }
}


class Single {

    public static void main(String args[]){

        Dog d = new Dog();

        d.eat();   // Parent method
        d.bark();  // Child method

    }
}