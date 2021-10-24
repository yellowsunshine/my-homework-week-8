package homework;

import java.util.Scanner;

public class Q3VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String letter = scanner.next().toLowerCase();
        scanner.close();

        //if user enters more than 1 character an error message is printed
        if (letter.length() > 1) {
            System.out.println("Error. Not a single character");
            //if user enters a symbol
        } else if (!(isItALetter(letter))) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter");
        } else if (letter.equals("a")|| letter.equals("e") || letter.equals("i")
        || letter.equals("o")|| letter.equals("u")) {
            System.out.println("Input letter is a vowel");
        }else{
            System.out.println("Input letter is a consonant");
        }
        }

        public static boolean isItALetter(String l){
        if (l.charAt(0)>96 && l.charAt(0)<123){
            return true;
        } return false;
        }


    }
