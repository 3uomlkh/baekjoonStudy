package bronze3_cw;

import java.io.*;

public class 별_찍기_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
