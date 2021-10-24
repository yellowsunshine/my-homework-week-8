package homework;
/*
Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */

import java.util.Scanner;

public class Q6PatternLikeTriangle {
    public static void main(String[] args) {

        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
