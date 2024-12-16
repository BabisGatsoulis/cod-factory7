package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsExercise1Gatsoulis {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert the number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
