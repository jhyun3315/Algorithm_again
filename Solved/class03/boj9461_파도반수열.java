
/*
    백준 - 파도반 수열
    https://www.acmicpc.net/problem/9461
 */

import java.io.*;

public class boj9461_파도반수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int N = 0;
        long[] dp = new long[101];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;

        for (int i = 5; i < 101; i++) {
            dp[i] = dp[i - 3] + dp[i - 2];
        }

        for (int t = 0; t < T; t++) {
            N = Integer.parseInt(br.readLine());
            sb.append(dp[N - 1]).append('\n');
        }

        System.out.println(sb);

    }
}
