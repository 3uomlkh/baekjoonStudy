package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ACM_호텔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y, x;				// 층, 거리
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();		// 사용하지 않는 변수
            int n = sc.nextInt();

            if (n % h == 0) {
                y = h;
                x = n / h;
            }
            else {
                y = n % h;
                x = n / h + 1;
            }

            System.out.println(100 * y + x);
        }

    }
}
