package OOPs.Classes;

import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("phy: " + marks[0]);
        System.out.println("chem" + marks[1]);
        System.out.println("Math: " + marks[3]);
    }
}
