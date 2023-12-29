package Lesson3;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] table = new int[n + 3][3];
        for (int i = 0; i < 3; i++) {
            table[i][0] = Integer.MAX_VALUE;
            table[i][1] = Integer.MAX_VALUE;
            table[i][2] = Integer.MAX_VALUE;
        }
        for (int i = 3; i < n + 3; i++) {
            table[i][0] = scanner.nextInt();
            table[i][1] = scanner.nextInt();
            table[i][2] = scanner.nextInt();
        }
        int[] dp = new int[n + 3];
        for (int i = 3; i < n + 3; i++) {
            dp[i] = Math.min(dp[i - 1] + table[i][0], Math.min(dp[i - 2] + table[i - 1][1], dp[i - 3] + table[i - 2][2]));
        }
        System.out.println(dp[n + 2]);
    }
}
