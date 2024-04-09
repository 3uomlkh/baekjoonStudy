package bronze3;

import java.io.*;
import java.util.*;
public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = 0;
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx + 1);

    }
}
