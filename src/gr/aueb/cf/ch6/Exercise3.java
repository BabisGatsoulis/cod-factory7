package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Exercise3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int [] arr = new int[6];

        arr = readArr(arr);

        System.out.printf("The array hasn't more than 3 Evens: %b\n", isMoreThanThreeEvens(arr));
        System.out.printf("The array hasn't more than 3 Odds: %b\n", isMoreThanThreeOdds(arr));
        System.out.printf("The array hasn't more than 3 Consecutives: %b\n", isMoreThanThreeConsecutives(arr));
        System.out.printf("The array has more than 3 Endings: %b\n", isMoreThanThreeEndings(arr));
        System.out.printf("The array has more than 3 Decates: %b\n", isMoreThanThreeDecates(arr));

    }

    public static int[] readArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            do {
                System.out.println("Enter a number between 1-49");
                arr[i] = in.nextInt();
            } while (arr[i] < 1 || arr[i] > 49);
        }
        return arr;
    }

    public static boolean isMoreThanThreeEvens(int[] arr) {
        int even = 0;
        for (int item : arr) {
            if (item % 2 == 0) even++;
        }
        return even <= 3;
    }

    public static boolean isMoreThanThreeOdds(int[] arr) {
        int odd = 0;
        for (int item : arr) {
            if (item % 2 != 0) odd++;
        }
        return odd <= 3;
    }

    public static boolean isMoreThanThreeConsecutives(int[] arr) {
        int con = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2)) con++;
        }
        return con <= 1;
    }

    public static boolean isMoreThanThreeEndings(int[] arr) {
        int[] endings = new int[10];
        boolean isMoreThanThreeEndings = false;

        for (int item : arr) {
            endings[item % 10] += 1;
        }

        for (int item : endings) {
            if (item > 3) isMoreThanThreeEndings = true;
            break;
        }
        return isMoreThanThreeEndings;
    }

    public static boolean isMoreThanThreeDecates(int[] arr) {
        int[] endings = new int[5];
        boolean isMoreThanThreeDecates = false;

        for (int item : arr) {
            endings[item / 10] += 1;
        }

        for (int item : endings) {
            if (item > 3) isMoreThanThreeDecates = true;
            break;
        }
        return isMoreThanThreeDecates;
    }

}
