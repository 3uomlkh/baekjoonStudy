package bronze3_cw;

import java.io.*;
import java.util.StringTokenizer;

public class 지능형_기차_2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int people = Integer.parseInt(st.nextToken());
        int n = 3;
        int maxPeople = 0;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            people -= Integer.parseInt(st.nextToken());
            people += Integer.parseInt(st.nextToken());
            maxPeople = Math.max(maxPeople, people);
        }
        System.out.println(maxPeople);
    }
}
