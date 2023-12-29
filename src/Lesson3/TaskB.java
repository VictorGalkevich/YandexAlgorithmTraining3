package Lesson3;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i, len = 1; j > -1 && len <= k && len <= i; j--, len++) {
                dp[i] += dp[j - 1];
            }
        }
        System.out.println(dp[n - 1]);
    }
}
