package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * O χρήστης θα δίνει:
 * 1. τους συνολικούς βαθμούς μαθημάτων
 * 2. το πλήθος των μαθημάτων
 *
 * θα υπολογίζει τον μ.ο και θα χαρακτηρίζει
 * Άριστα αν μ.ο >=9
 * Πολύ καλά αν ο μ.ο >=7
 * Καλώς αν ο μ.ο >=5
 * Αποτυχία αν ο μ.ο <5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = in.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero");
            System.exit(1);
        }

        System.out.println("Please insert courses count");
        coursesCount = in.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error: The average must be less or equal than ten");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }

    }
}
