package bronze3_cw;

import java.io.*;

public class 별_찍기_6_2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = N; i > 0; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
