package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένας SECRET που είναι integer και ο
 * χρήστης με μία μόνο προσπάθεια θα προσπαθήσει
 * να τον βρει.
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Inser a num to guess the secret");
        num = in.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found !!");
        } else {
            System.out.println("Failure");
        }
    }
}
