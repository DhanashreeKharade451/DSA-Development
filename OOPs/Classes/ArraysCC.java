package OOPs.Classes;

import java.util.Scanner;

public class ArraysCC {
    public static void update(int marks[]) {
        // update an array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        update(marks);

        // print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
    }

    // public static void main(String[] args) {
    // creating an array
    // int marks[] = new int[100];

    // Scanner sc = new Scanner(System.in);

    // marks[0] = sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[3] = sc.nextInt();

    // System.out.println("phy: " + marks[0]);
    // System.out.println("chem" + marks[1]);
    // System.out.println("Math: " + marks[3]);
    // }
}
