package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int n = 0;

        do {
            printMenu();
            choice = in.nextInt();

            if (choice < 1 || choice > 6) {
                System.out.println("Give a choice between 1-6");
                continue;
            }

            if (choice == 6) {
                System.out.println("Έξοδος από το πρόγραμμα");
                break;
            }

            System.out.println("Δώστε αριθμό για αστεράκια");
            n = in.nextInt();

            switch (choice){
                case 1:
                    horizontalStars(n);
                    break;
                case 2:
                    verticalStars(n);
                    break;
                case 3:
                    tableStars(n);
                    break;
                case 4:
                    increaseStars(n);
                    break;
                case 5:
                    decreaseStars(n);
                    break;
                case 6:
                    System.out.println("Έξοδος από το πρόγραμμα");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
            System.out.println();
        } while (choice != 6);
        System.out.println("Thank you!");
        }

        public static void printMenu() {
            System.out.println("1. Eμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Eμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Eμφάνισε n γραμμές με n αστεράκια ");
            System.out.println("4. Eμφάνισε n γραμμές με αστεράκια 1 εώς n");
            System.out.println("5. Eμφάνισε n γραμμές με αστεράκια n εώς 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static void horizontalStars(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.printf("*");
        }
    }

    public static void verticalStars(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.println("*");
        }
    }

    public static void tableStars(int n) {
        for (int j = 1; j <=n; j++) {
            horizontalStars(n);
            System.out.println();
        }
    }

    public static void increaseStars(int n) {
        for (int j = 1; j <=n; j++) {
            horizontalStars(j);
            System.out.println();
        }
    }

    public static void decreaseStars(int n) {
        for (int j = n; j >=1; j--) {
            horizontalStars(j);
            System.out.println();
        }
    }
}
