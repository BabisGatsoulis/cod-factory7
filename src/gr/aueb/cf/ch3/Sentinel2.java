package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {

    public static void main(String[] args) {
        int possitivesCount = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");

        while ((inputNum = in.nextInt()) >= 0) {
            possitivesCount++;
            System.out.println("Please insert a num");
            inputNum = in.nextInt();
        }

        System.out.println("Positive count:" + possitivesCount);
    }
}
