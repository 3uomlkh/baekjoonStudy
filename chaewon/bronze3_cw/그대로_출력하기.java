package bronze3_cw;

import java.io.*;
public class 그대로_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;

        while((str = br.readLine()) != null) {
            sb.append(str).append('\n');
        }

        System.out.print(sb);

        br.close();
        bw.flush();
        bw.close();
    }
}
