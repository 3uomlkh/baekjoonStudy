package bronze3_cw;

import java.io.*;
import java.util.StringTokenizer;
public class 직사각형에서_탈출 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xCount = Math.min((w - x), x);
        int yCount = Math.min((h - y), y);

        System.out.println(Math.min(xCount, yCount));
    }
}
