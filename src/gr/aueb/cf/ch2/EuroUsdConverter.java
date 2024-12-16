package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euro = 0;
        final int p = 99;
        int dol = 0;
        int dollacents = 0;
        int totalDollars = 0;

        System.out.println("Give Euro cents");
        euro = in.nextInt();
        totalDollars = euro * p;
        dol = totalDollars / 100;
        dollacents = totalDollars % 100;
        System.out.printf("Euros %d convert in %d d end %d c cents", euro, dol, dollacents);
}
}