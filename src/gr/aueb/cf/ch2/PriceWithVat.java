package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat
 */
public class PriceWithVat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double VAT= 1.24;
        double netPrice = 0.0;
        double totalPrice = 0.0;

        System.out.println("Give net price");
        netPrice = in.nextDouble();

        totalPrice = netPrice * VAT;

        System.out.printf("Total price is: %.2f",totalPrice);

    }
}
