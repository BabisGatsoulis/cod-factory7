package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβανει απο τον χρηστη 2ψηφιο ακεραιο και εκτυπώνει το αθροισμα των ψηφίων του
 */
public class DigitsSum {
    public static void main(String[] args) {
        int right = 0, left = 0, number = 0, sum=0;
        Scanner in = new Scanner(System.in);

        System.out.println("Give number");
        number = in.nextInt();
        left = number / 10;
        right = number % 10;
        sum = left + right;

        System.out.printf("The sum of %d is: %d\n", number,sum);
    }
}
