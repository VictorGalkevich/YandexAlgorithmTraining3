package Lesson3;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n];
        int[] route = new int[n];
        dp[0] = 0;
        route[0] = -1;
        for (int i = 1; i < n; i++) {
            int s1 = Integer.MAX_VALUE;
            int i1 = 0;
            int s2 = Integer.MAX_VALUE;
            int i2 = 0;
            int s3 = Integer.MAX_VALUE;
            int i3 = 0;
            if ((i + 1) % 2 == 0) {
                s2 = dp[(i + 1) / 2 - 1];
                i2 = (i + 1) / 2 - 1;
            }
            if ((i + 1) % 3 == 0) {
                s3 = dp[(i + 1) / 3 - 1];
                i3 = (i + 1) / 3 - 1;
            }
            s1 = dp[i - 1];
            i1 = i - 1;
            if (s1 < s2 && s1 < s3) {
                dp[i] = s1 + 1;
                route[i] = i1;
            } else if (s2 < s3) {
                dp[i] = s2 + 1;
                route[i] = i2;
            } else {
                dp[i] = s3 + 1;
                route[i] = i3;
            }
        }
        int len = dp[n - 1] + 1;
        int[] arr = new int[len];
        arr[len - 1] = n;
        int cnt = 1;
        int next = route[n - 1];
        while (cnt < len) {
            arr[len - cnt - 1] = next + 1;
            next = route[next];
            cnt++;
        }
        System.out.println(dp[n - 1]);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(arr[i]).append(" ");
        }
        System.out.println(builder);
    }
}
