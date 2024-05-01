package bronze3_cw;

import java.io.*;
import java.util.StringTokenizer;

public class 윷놀이_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = 3;
        while (n-- > 0) {
            StringTokenizer  st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += Integer.parseInt(st.nextToken());
            }

            switch (sum) {
                case 0 :
                    sb.append("D").append("\n");
                    break;
                case 1:
                    sb.append("C").append("\n");
                    break;
                case 2:
                    sb.append("B").append("\n");
                    break;
                case 3:
                    sb.append("A").append("\n");
                    break;
                case 4 :
                    sb.append("E").append("\n");
                    break;
                default :
                    break;
            }
        }

        System.out.println(sb);
    }
}
