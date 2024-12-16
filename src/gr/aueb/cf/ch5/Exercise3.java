package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;

        System.out.println("Enter a number");
        number = in.nextInt();

        System.out.println("Square number of " + number + " is " + square(number));
    }

    public static int square(int number) {
        return number * number;
    }
}
