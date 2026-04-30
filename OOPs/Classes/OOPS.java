
package OOPs.Classes;

public class OOPS {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "shradha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy constructor
        s2.password = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        //////////////////////////
        // create objects of classes pen and student
        // Pen p1 = new Pen(); // pen object
        // p1.setColor("blue");
        // System.out.println(p1.getColor());

        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());

        // BankAccount myAccount = new BankAccount();
        // myAccount.username = "dhanashreekharade";
        // myAccount.setPassword("abcdefghi");

    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
    }

    // // shallow copy constructor

    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // void calcPercentage(int phy, int chem, int math) {
    // percentage = (phy + chem + math) / 3;
    // }

}

// class BankAccount {
// public String username;
// private String password;

// public void setPassword(String pwd) {
// password = pwd;
// }
// }

// class Pen {
// private String color;
// private int tip;

// String getColor() {
// return this.color;

// }

// int getTip() {
// return this.tip;
// }

// void setColor(String newColor) {
// color = newColor;
// }

// void setTip(int newTip) {
// tip = newTip;
// }
// }
// //