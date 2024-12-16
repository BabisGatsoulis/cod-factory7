package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες >= 18.
 * Ελέγχει αν ία ηλικία έχει δικαίωμα
 * να ψηφίσει.
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int ADULT = 18;
        int age = 0;
        boolean isEligible = false;

        System.out.println("Please insert age");
        age = in.nextInt();

        isEligible = age >= ADULT;

        System.out.println("isEligible:" +isEligible);
    }
}
