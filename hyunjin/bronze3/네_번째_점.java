package bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class 네_번째_점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token;

        int x_axis[] = new int[3];
        int y_axis[] = new int[3];

        for(int i = 0; i < 3; i++) {
            token = new StringTokenizer(br.readLine());
            //한줄씩 입력받아서 공백을 기준으로
            x_axis[i] = Integer.parseInt(token.nextToken()); //앞은 x좌표
            y_axis[i] = Integer.parseInt(token.nextToken()); //뒤는 y좌표
        }

        br.close();

        int x = 0;
        int y = 0;

        if(x_axis[0] == x_axis[1]){ //만약 x 0인덱스와 1인덱스가 같다면 2개 있다는 뜻임으로
            x = x_axis[2]; //0과 1인덱스가 아닌 2인덱스를 저장
        }else{ //0과 1인덱스의 x값이 다른데,
            //만약, x의 0인덱스와 2인덱스가 같으면 1인덱스 저장 그게 아니라면 0인덱스를 저장
            x = (x_axis[0] == x_axis[2]) ? (x_axis[1]) : (x_axis[0]);
        }

        //y도 x와 마찬가지
        if(y_axis[0] == y_axis[1]){
            y = y_axis[2];
        }else{
            y = (y_axis[0] == y_axis[2]) ? (y_axis[1]) : (y_axis[0]);
        }

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}
