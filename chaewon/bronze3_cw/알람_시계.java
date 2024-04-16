package bronze3_cw;

import java.io.*;
import java.util.*;

public class 알람_시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if (M < 45) {
            if (H == 0) sb.append("23").append(" ");
            else sb.append(H - 1).append(" ");
            M = 45 - M;
            sb.append(60 - M);
        } else {
            sb.append(H).append(" ");
            sb.append(M - 45);
        }
        System.out.println(sb);
    }
}
