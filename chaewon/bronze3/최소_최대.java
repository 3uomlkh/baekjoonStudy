package bronze3;

import java.io.*;
import java.util.*;

public class 최소_최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] numbers = new int[n];
        while (st.hasMoreTokens()) {
            numbers[index++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " + numbers[n - 1]);
    }
}
