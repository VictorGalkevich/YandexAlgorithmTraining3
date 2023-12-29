package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nails = new int[n];
        for (int i = 0; i < n; i++) {
            nails[i] = scanner.nextInt();
        }
        Arrays.sort(nails);
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = nails[1] - nails[0];
        if (n > 2) {
            dp[2] = nails[2] - nails[1] + dp[1];
        }
        for (int i = 3; i < n; i++) {
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + nails[i] - nails[i - 1];
        }
        System.out.println(dp[n - 1]);
    }
}
