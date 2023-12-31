package Lesson3;

import java.util.Scanner;

public class TaskAdivisionA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i; // Инициализируем dp[i] максимальным возможным количеством слагаемых
            for (int j = 1; j * j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j * j] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}