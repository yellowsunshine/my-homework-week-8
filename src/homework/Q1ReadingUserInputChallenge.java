package homework;

import java.util.Scanner;

public class Q1ReadingUserInputChallenge {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number # : " + count);

            boolean validNumber = scanner.hasNextInt();
                /* hasnextint() returns true if the next token in this scanners
                input is an int value */
            if (validNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            //Always return new user input
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        scanner.close();//Scanner closed


    }
}
