package bronze3_cw;

import java.util.Scanner;

public class 별_찍기_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
