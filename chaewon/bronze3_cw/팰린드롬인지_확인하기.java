package bronze3_cw;

import java.io.*;
public class 팰린드롬인지_확인하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        if (sb.toString().contentEquals(sb.reverse())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
