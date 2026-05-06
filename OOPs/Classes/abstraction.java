
public class abstraction {
    public static void main(String args[]) {
        Mustang MyHorse = new Mustang();

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // h.changeColor();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

    }
}

abstract class Animal {
    String color;

    Animal() {

        // color = "yellow";
        System.out.println("Animal constructor called");

    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // abstract means every animal should contain method walk.
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "red";
    }

    void walk() {
        System.out.println("walk on 4 legs"); // impliment abstract method from parent class

    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on4 legs");
    }
}