package gr.aueb.cf.ch2;

/**
 *Print Date
 */
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day, month, year;
        int formattedYear =0;

        System.out.println("Give day");
        day = in.nextInt();
        System.out.println("Give month");
        month = in.nextInt();
        System.out.println("Give year");
        year = in.nextInt();
        formattedYear = year % 100;
        System.out.printf("The date is %02d/%02d/%02d", day, month, formattedYear);
    }
}

