package bronze3_cw;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최댓값_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] numbers = new int[9][9];

        for (int i = 0; i < numbers.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int[] index = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                max = Math.max(numbers[i][j], max);
                if (max == numbers[i][j]) {
                    index[0] = i + 1;
                    index[1] = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(index[0] + " " + index[1]);

    }
}
