package bronze3;

import java.util.Scanner;

public class 별_찍기_9 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
