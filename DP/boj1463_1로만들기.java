/*
    백준 - 1로 만들기
    https://www.acmicpc.net/problem/1463
 */

import java.io.*;

public class boj1463_1로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 3];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= N; i++) {
            int tmp2 = Integer.MAX_VALUE;
            int tmp3 = Integer.MAX_VALUE;

            if (i % 3 == 0)
                tmp3 = dp[i / 3] + 1;
            if (i % 2 == 0)
                tmp2 = dp[i / 2] + 1;
            dp[i] = Math.min(tmp3, Math.min(tmp2, dp[i - 1] + 1));
        }

        System.out.println(dp[N]);

    }
}
