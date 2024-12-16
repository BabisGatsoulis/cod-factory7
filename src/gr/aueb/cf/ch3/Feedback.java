package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Exercise 2
 *Read number and gives feedback
 */
public class Feedback {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Give a number between 1-5");
            number = in.nextInt();
            if (number <= 0  || number >5){
                System.out.println("Λάθος αριθμός");
                System.exit(1);
            }
            if (number == 1){
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (number == 2){
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (number == 3){
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (number == 4){
                System.out.println("Επιλέξατε Αναζήτηση");
            } else{
                System.out.println("Επιλέξατε Έξοδο");
            }
        } while (number != 5);
        System.out.println("Σας ευχαριστούμε πολύ!");
    }
}
