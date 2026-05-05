package OOPs.Classes;

public class abstraction {
    public static void main(String args[]) {

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

    }
}

abstract class Animal {
    String color;

    Animal() {

        color = "yellow";
        System.out.println("Constructor called, color = " + color);
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // abstract means every animal should contain method walk.
}

class Horse extends Animal {

    void changeColor() {
        color = "red";
    }

    void walk() {
        System.out.println("walk on 4 legs"); // impliment abstract method from parent class

    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on4 legs");
    }
}