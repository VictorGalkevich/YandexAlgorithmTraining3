package Lesson3;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n < 3 ? 3 : n];
        dp[0] = 2;
        dp[1] = 4;
        dp[2] = 7;
        if (n < 4) {
            System.out.println(dp[n - 1]);
            return;
        }
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        System.out.println(dp[n - 1]);
    }
}
