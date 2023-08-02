
/*
    백준 - 다리 놓기
    https://www.acmicpc.net/problem/1010
 */

import java.io.*;
import java.util.*;

public class boj1010_다리놓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[30][30];

        for (int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int s;
        int d;

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine(), " ");
            s = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            // d개 중에서 s개 선택하기
            sb.append(dp[d][s]).append('\n');
        }
        System.out.println(sb);
    }

}
