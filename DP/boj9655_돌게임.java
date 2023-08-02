
/*
    백준 - 돌 게임
    https://www.acmicpc.net/problem/9655
 */

import java.io.*;

public class boj9655_돌게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[N + 4];

        dp[0] = false;
        dp[1] = true;
        dp[2] = false;
        dp[3] = true;

        for (int i = 4; i <= N; i++) {
            if (!dp[i - 1] || !dp[i - 3])
                dp[i] = true;
        }

        StringBuilder sb = new StringBuilder();
        if (dp[N])
            sb.append("SK");
        else
            sb.append("CY");

        System.out.println(sb);
    }
}
