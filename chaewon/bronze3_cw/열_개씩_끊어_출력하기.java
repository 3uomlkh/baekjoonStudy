package bronze3_cw;

import java.io.*;
public class 열_개씩_끊어_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0; i < str.length(); i+=10) {
            num += 10;
            if (num >= str.length()) {
                sb.append(str.substring(i));
                break;
            }
            String s = str.substring(i, num);
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
