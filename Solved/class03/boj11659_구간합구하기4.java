
/*
    백준 - 구간 합 구하기 4
    https://www.acmicpc.net/problem/11659
 */

import java.io.*;
import java.util.StringTokenizer;

public class boj11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] dp = new int[N];
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        for (int i = 1; i < N; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if (i - 2 < 0)
                sb.append(dp[j - 1]).append('\n');
            else
                sb.append(dp[j - 1] - dp[i - 2]).append('\n');
        }
        System.out.println(sb);
    }
}
