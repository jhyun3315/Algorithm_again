/*
 *  백준 - 2xn 타일링 2
 *  https://www.acmicpc.net/problem/11727
 */

import java.io.*;

public class boj11727_2xn타일링2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;
        dp[4] = 11;

        for (int i = 5; i <= N; i++) {
            dp[i] = ((2 * dp[i - 2]) + dp[i - 1]) % 10007;
        }

        System.out.println(dp[N]);

    }
}
