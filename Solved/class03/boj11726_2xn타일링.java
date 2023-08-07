/*
    백준 - 2xn 타일링
    https://www.acmicpc.net/problem/11726
 */

import java.io.*;

public class boj11726_2xn타일링 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < N + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        System.out.println(dp[N]);

    }
}
