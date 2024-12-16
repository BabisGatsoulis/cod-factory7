package gr.aueb.cf.ch2;

/**
 * Converts Fahrenheit Degrees in Celcius
 */
import java.util.Scanner;

public class FahrenheitCelcius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f;
        int c = 0;

        System.out.println("Give Fahrenheit degrees");
        f = in.nextInt();
        c = 5 * (f-32) / 9;
        //System.out.printf("The degrees Celcius is: %d", c);
        System.out.printf("Fahrenheit degrees %d\u2109 is %d\u2103\n", f, c);
    }
}
