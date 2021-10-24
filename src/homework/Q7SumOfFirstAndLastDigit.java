package homework;

import java.util.Scanner;

public class Q7SumOfFirstAndLastDigit {

    //method to find sum of first and last digit
    public static int sumFirstAndLastDigit(int number) {

        //declaring variables
        int lastDigit, firstDigit, divisor;
        int totalDigits = 0;
        int sum = 0;

        // finding last digit
        lastDigit = number%10;

        //finding the total number of digits
        totalDigits = findDigits(number);

        //calculating divisor value
        divisor = (int)Math.pow(10, totalDigits-1);

        //finding first digit
        firstDigit = number / divisor;

        //adding values
        sum = firstDigit+lastDigit;

        return sum;
    }

    //method to find the total number of digits
    private static int findDigits(int number){
        int count = 0;
        while (number!=0){
            count++;
            number = number/10;
        }
        return count;
    }

    public static void main(String[] args) {

        // declare variables
        int number = 0;
        int sum = 0;

        // create Scanner class object
        // for reading the values
        Scanner scan =  new Scanner(System.in);

        // read input
        System.out.print("Enter a number: ");
        number = scan.nextInt();


        // find sum of digits of number
        sum = sumFirstAndLastDigit(number);

        // display result
        System.out.println("The sum of first & last"
                +" digit of the number "+number
                +" = "+ sum);

        // close Scanner class object
        scan.close();
    }
}
