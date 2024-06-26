package bronze3_cw;

import java.io.*;
import java.util.*;

public class 직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            if (a * a == (b * b + c * c)) {
                sb.append("right").append('\n');
            } else if (b * b == (c * c + a * a)) {
                sb.append("right").append('\n');
            } else if (c * c == (a * a + b * b)) {
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}
