package OOPs.Classes;

public class Inheritance {
    public static void main(String[] args) {

        // create an object

        fish dolfinFish = new fish();
        dolfinFish.eat();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // Fish shark = new Fish();
        // shark.eat();

    }
}
///////////
// Multilevel inheritance
// base class
// class Animal {
// String color; // property

// // function
// void eat() {
// System.out.println("eats");
// }

// // 2nd function
// void breathe() {
// System.out.println("breathes");
// }
// }

// class Mammal extends Animal {
// int legs;
// }

// class Dog extends Mammal {
// String breathe;
// }
//////////////////
// Derived Class /sub class
// class Fish extends Animal {
// int fins;

// void swim() {

// }
// }

// hierarchical inheritance

class Animal {
    String color; // property

    // function
    void eat() {
        System.out.println("eats");
    }

    // 2nd function
    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class fish extends Mammal {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Mammal {
    void fly() {
        System.out.println("fly");
    }
}