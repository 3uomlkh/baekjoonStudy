package bronze3_cw;

import java.io.*;
import java.util.StringTokenizer;

public class 저작권_2914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken()) - 1;

        System.out.println((A * I) + 1);
    }
}
