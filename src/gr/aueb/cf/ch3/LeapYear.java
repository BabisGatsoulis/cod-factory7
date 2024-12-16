package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Exercise 1
 * Υπολογισμός δίσεκτου έτους
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean leapYear = false;

        System.out.println("Please insert year");
        year = in.nextInt();
        if (year <=0) {
            System.out.println("You gave negative year");
            System.exit(1);
        } else if (year<100) {
            if (year % 4 == 0) {
                leapYear = true;
            }
        } else if ((year >= 100) && (year < 400)) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                leapYear = true;
            }
        } else if (year >= 400) {
            if ((year % 4 == 0) && (year % 400 == 0)) {
                leapYear = true;
            } else if ((year % 4 == 0) && (year % 100 != 0)) {
                leapYear = true;
            }
        }
        System.out.println("Year is leap:" + leapYear);
    }
}
