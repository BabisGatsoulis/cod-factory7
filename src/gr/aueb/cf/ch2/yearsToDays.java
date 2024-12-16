package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *Convert years (ages) to days
 */
public class yearsToDays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        final int DAYS_PER_YEAR = 365;
        int days = 0;

        System.out.println("Please insert your age");
        age = in.nextInt();

        days = age * DAYS_PER_YEAR;
        System.out.println("Age in years:" + age + ",Age in days:" + days);
    }

}
