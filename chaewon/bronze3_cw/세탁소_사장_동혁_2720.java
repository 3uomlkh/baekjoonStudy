package bronze3_cw;

import java.io.*;

public class 세탁소_사장_동혁_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] charges = {25, 10, 5, 1};
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            for (int x : charges) {
                System.out.print(c / x + " ");
                c %= x;
            }
            System.out.println();
        }
    }
}
