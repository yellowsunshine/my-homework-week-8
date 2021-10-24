package homework;

import java.util.Scanner;

public class Q2MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min=0;
        int max =0;
        boolean isMax = false;
        boolean isMin = false;

        while (true) {
            System.out.println("Enter the number");
            if (in.hasNextInt()) {
                int input = in.nextInt();
                if (input > max || !isMax) {
                    max = input;
                    isMax = true;
                }
                if (input < min || !isMin) {
                    min = input;
                    isMin = true;
                }
            } else {
                System.out.println("Minimum Number = " + min);
                System.out.println("Maximum Number = " + max);
                break;
            }
        }
        in.close();
    }

}