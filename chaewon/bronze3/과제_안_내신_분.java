package bronze3;

import java.util.Scanner;

public class 과제_안_내신_분 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[31];

        for(int i = 1; i < 29; i++) {
            int idx = sc.nextInt();
            students[idx] = 1;
        }

        sc.close();

        for(int i = 1; i < students.length; i++) {
            if(students[i] != 1)
                System.out.println(i);
        }
    }
}
