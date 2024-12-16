package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Eμφανιζει ενα menu επιλογών και ο χρήστης
 * επιλέγει ένα menu item k=και στην συνέχεια ανάλογα
 * με την επιλογή εκτελείται κάποια ενέργεια.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = in.nextInt();
            if (ischoicevalid(choice)) {
                System.out.println("Error. Choice not valid");
                continue;
            }

            doOnChoice(choice);


        } while (choice !=5);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα απο τα παρακάτω ");
        System.out.println("1. Eισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }

    public static boolean ischoicevalid(int choice) {
        return choice <= 1 || choice >= 5;
    }

    public static void doOnChoice(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Eισαγωγή");
                break;
            case 2:
                System.out.println("Διαγραφη");
                break;
            case 3:
                System.out.println("Αναζήτη");
                break;
            case 4:
                System.out.println("Eνημέση");
                break;
            case 5:
                System.out.println("Eξοδος");
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
    }
}
