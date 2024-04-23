package bronze3_cw;

import java.io.*;

public class 전자레인지_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;

        if (T % (60 * 5) == 0 || T % 10 == 0) {
            while (T > 0) {
                if (T >= 10 && T < 60) {
                    c = T / 10;
                    T %= 10;
                } else if (T >= 60 && T < 60 * 5) {
                    b = T / 60;
                    T %= 60;
                } else {
                    a = T / (60 * 5);
                    T %= (60 * 5);
                }
            }
        }
        if (a == 0 && b == 0 && c == 0) System.out.print("-1");
        else System.out.print(a + " " + b + " " + c);
    }
}
