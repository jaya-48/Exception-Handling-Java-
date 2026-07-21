package org.example.Polymorphism;

class Aeroplane {
    public void method1() {
        System.out.println("Aeroplane method1");
    }

    public void method2() {
        System.out.println("Aeroplane method2");
    }

    public void method3() {
        System.out.println("Aeroplane method3");
    }
}

class CargoPlane extends Aeroplane {
    @Override
    public void method1() {
        System.out.println("CargoPlane is carrying goods");
    }

    @Override
    public void method2() {
        System.out.println("CargoPlane is taking off");
    }

    @Override
    public void method3() {
        System.out.println("CargoPlane is landing");
    }
}

class FighterPlane extends Aeroplane {
    @Override
    public void method1() {
        System.out.println("FighterPlane is attacking");
    }

    @Override
    public void method2() {
        System.out.println("FighterPlane is taking off");
    }

    @Override
    public void method3() {
        System.out.println("FighterPlane is landing");
    }
}


class Airport {
    public void disp(Aeroplane a1) {
        a1.method1();
        a1.method2();
        a1.method3();
    }
}
public class Main3 {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();

        Airport air1 = new Airport();
        Aeroplane a1=new Aeroplane();

        //air1.disp(cp);   // Runtime polymorphism
       // air1.disp(fp);
        air1.disp(a1);// Runtime polymorphism
    }
}
