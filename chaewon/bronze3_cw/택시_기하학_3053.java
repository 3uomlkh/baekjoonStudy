package bronze3_cw;

import java.io.*;

public class 택시_기하학_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double R = Double.parseDouble(br.readLine());

        System.out.println(R * R * Math.PI);
        System.out.println(2 * R * R);
    }
}
