package bronze3_cw;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 삼각형과_세_변_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;
            int[] arr = {a, b, c};
            Arrays.sort(arr);
            if (arr[0] + arr[1] <= arr[2]) {
                System.out.println("Invalid");
                continue;
            }
            if (a != b && b != c && a != c) {
                System.out.println("Scalene");
            } else if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Equilateral");
            }
        }

    }
}
