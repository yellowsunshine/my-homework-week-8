package homework;
/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@

 */

import java.util.Scanner;

public class Q8NestedLoopsOfAt {

    public static void main(String[] args) {

        int i, j;
        int n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("@");
            System.out.println("");
        }
    }
}
