package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Yπολογίζει το άθροισμα των άρτιων από το 2
 * μέχρι ένα όριο που δίνει ο χρήστης
 */
public class SumOfEvens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 2;
        int number = 0;
        int sum = 0;

        System.out.println("Please insert number");
        number = in.nextInt();

        while (i <= number) {
            sum+=i;
            i+=2;
        }

        System.out.println("The sum of even numbers upto " + number + " is : " + sum);
    }
}
