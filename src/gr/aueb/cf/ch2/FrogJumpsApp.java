package gr.aueb.cf.ch2;

/**
 * x =10
 * y = 85
 * j = 30
*/
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        while (start <= target) {
            jumps++;
            start += hop;
        }

        System.out.println("Jumps is:" + jumps);
    }
 }


