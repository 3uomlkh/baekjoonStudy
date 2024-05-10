package bronze3_cw;

import java.io.*;

public class 홀수_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] odd = new int[7];

        for (int i = 0; i < 7; i++) {
            odd[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            if (odd[i] % 2 != 0) {
                sum += odd[i];
                min = Math.min(min, odd[i]);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
