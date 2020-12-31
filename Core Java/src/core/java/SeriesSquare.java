package core.java;

import java.util.Scanner;

/**
 *
 * @author amitguho 04.08.2020 12:21 PM
 */
public class SeriesSquare {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
            System.out.print(i + "^" + i + " ");
        }
        System.out.println("");
        System.out.println(sum);
    }
}
