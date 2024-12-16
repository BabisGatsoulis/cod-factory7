package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Eμφανίζει ένα μενου επιλογών (Πρόσθεση, Αφαίρεση κοκ)
 * Ο χρήστης επιλέγει
 * Ανάλογα με την επιλογή εκτελείτε η αντίστοιχη πράξη
 * Εκτελείται επαναληπτικά μεχρι ο χρήστης να επιλέξει έξοδος
 */
public class Calculator {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result = 0;
        while (true){
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error in choice must be between 1-6. Try again");
                continue;
            }

            if (choice==6) {
                System.out.println("Exit");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα απο τα παρακάτω ");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. DIV");
        System.out.println("5. Mod");
        System.out.println("6. exit");
    }

    public static int getOneInt() {
        return in.nextInt();
    }

    public static boolean isChoiceValid( int choice){
        return choice >=1 && choice <=6;
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Enter two numbers");

        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
        return result;
    }

    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    public static int sub (int num1, int num2) {
        return num1 - num2;
    }

    public static int mul (int num1, int num2) {
        return num1 * num2;
    }

    public static int div (int num1, int num2) {
        if (num2==0) {
            System.out.println("Number must not be zero");
            return 0;
        }
        return num1 / num2;
    }

    public static int mod (int num1, int num2) {
        if (num2==0) {
            System.out.println("Number must not be zero");
            return 0;
        }
        return num1 % num2;
    }
}
