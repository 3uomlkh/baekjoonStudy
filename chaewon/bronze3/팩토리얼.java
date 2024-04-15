package bronze3;

import java.io.*;
public class 팩토리얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        bw.write(factorial(N) + "\n");

        bw.flush();
        bw.close();
    }

    static int factorial(int N)
    {
        int result = 1;

        for(int i = 2; i <= N; i++)
        {
            result = result * i;
        }
        return result;
    }
}
