package gr.aueb.cf.ch5;

import java.util.Scanner;

import static gr.aueb.cf.ch5.Exercise5.findMax;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Enter 3 numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println("Max number of " + a + " " + b + " "+ c + " is " + findMax(a,b,c));
    }

    public static int findMax(int a, int b, int c){
        int temp, temp1, temp2;
        temp1 = Math.max(a,b);
        temp2 = Math.max(a,c);
        temp = Math.max(temp1,temp2);
        return temp;
    }
}

