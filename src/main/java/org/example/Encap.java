package org.example;

import java.util.Scanner;

class Encap1{
    private int age=25;

    public int getAge() {
        return age;
    }

    public void setAge(int num) {
        this.age = num;
    }
}
public class Encap {
    private static void ageCondition(){
        System.out.println("age is 23 ");
    }
    public static void main(String[] args){
        ageCondition();
        Encap1 e=new Encap1();
        e.setAge(27);
        System.out.println(e.getAge());
    }
}

