package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει ημέρες ώρες λεπτα δευτερόλεπτα σε συνολικά
 * δευτερόλεπτα και εκτυπώνει το τελικό αποτέλεσμα
 */
public class DateTimeToSecondConverter {
    public static void main(String[] args) {
        int days = 0, hours = 0, minutes = 0, seconds = 0;
        int totalSeconds = 0;
        final int SECONDS_PER_DAY = 24 * 3600;
        final int SECONDS_PER_HOURS = 3600;
        final int SECONDS_PER_MINUTES = 60;
        Scanner in = new Scanner(System.in);

        System.out.println("Give days");
        days = in.nextInt();
        System.out.println("Give hours");
        hours = in.nextInt();
        System.out.println("Give minutes");
        minutes = in.nextInt();
        System.out.println("Give seconds");
        seconds = in.nextInt();

        totalSeconds = (days*SECONDS_PER_DAY)+(hours*SECONDS_PER_HOURS)+(minutes*SECONDS_PER_MINUTES)+seconds;

        System.out.printf(Locale.US," Total seconds is: %,d", totalSeconds);
    }
}
