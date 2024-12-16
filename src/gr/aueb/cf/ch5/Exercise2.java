package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c = 0.0;

        System.out.println("Enter degrees in \u2103");
        c = in.nextDouble();

        System.out.println(c + " \u2103 is " + celsiusToFahrenheit(c) + "\u2109 ");
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9) / 5 + 32;
    }
}
