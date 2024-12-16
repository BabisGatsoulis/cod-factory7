package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Exercise4 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {0,1,4,4,4,6,7,8,8,8,8,8};
        int [] indexes = new int[2];
        int key;

        key = insertKey();

        if (iskeyfound(arr, key)) {
            indexes = getLowAndHighIndexOf(arr, key);
            System.out.printf("Low Index: %d, Hign Index: %d", indexes[0], indexes[1] );
        } else {
            System.out.print("Key wasn't found in arrey");
        }

    }

    public static int insertKey() {

        System.out.println("Enter the key");

        return in.nextInt();
    }

    public static boolean iskeyfound (int[] arr, int key) {
        boolean iskeyfound = false;

        for (int item : arr) {
            if (item == key) {
                iskeyfound = true;
                break;
            }
        }

        return iskeyfound;
    }


    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] indexes = new int [2];
        int position = 0;
        int count = 0;

        for (int i=0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }

        }

        for (int i = position; i < arr.length; i++ ) {
            if (arr[i] == key) count++;
        }

        indexes[0] = position;
        indexes[1] = position + count -1;

        return indexes;
    }

}
