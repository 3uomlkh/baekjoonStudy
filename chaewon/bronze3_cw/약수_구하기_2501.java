package bronze3_cw;

import java.io.*;
import java.util.*;

public class 약수_구하기_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        Collections.sort(list);
        if (list.size() < K) {
            System.out.println("0");
        } else {
            System.out.println(list.get(K - 1));
        }
    }
}
