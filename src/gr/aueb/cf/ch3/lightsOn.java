package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn Lights on,  if it is raining
 * AND car is running (>100) OR is dark
 */
public class lightsOn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean lightsOn = false;
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        int speed = 0;
        final int MAX_Speed = 100;

        System.out.println("Insert car's speed");
        speed =  in.nextInt();

        System.out.println("Is it raining ?");
        isRaining = in.nextBoolean();

        System.out.println(" Is it dark ?");
        isDark = in.nextBoolean();

        isRunning = (speed > MAX_Speed);
        lightsOn =  isRaining && (isRunning ^ isDark );

        System.out.println("Lights on:" + lightsOn);
    }
}
