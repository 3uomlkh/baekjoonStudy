package bronze3;

import java.util.*;

public class 세_수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] numbers = {a, b, c};

        Arrays.sort(numbers);

        System.out.println(numbers[1]);
    }
}
