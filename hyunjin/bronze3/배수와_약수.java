package bronze3;

import java.util.Scanner;

public class 배수와_약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();

            if (firstNum == 0 && secondNum == 0) break;

            if (secondNum / firstNum == 0) {
                System.out.println("factor");
            } else if (firstNum / secondNum == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
