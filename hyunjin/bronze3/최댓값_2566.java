package bronze3;

import java.util.Scanner;

public class 최댓값_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] maxInfo = {0, 0, 0};

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = sc.nextInt();
                if (num > maxInfo[0]) {
                    maxInfo[0] = num;
                    maxInfo[1] = i;
                    maxInfo[2] = j;
                }
            }
        }

        System.out.println(maxInfo[0]);
        System.out.print(maxInfo[1] + " ");
        System.out.println(maxInfo[2]);
    }
}
