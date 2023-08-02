package solvedAC.class03;
/*
    백준 - 피보나치 함수
    https://www.acmicpc.net/problem/1003
 */


import java.io.*;

public class boj1003_피보나치함수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[][] dp = new int[41][2];

        // 초기값 설정
        dp[0][0] = 1; dp[0][1] = 0;
        dp[1][0] = 0; dp[1][1] = 1;

        // fibonacci(3) = fibonacci(2) + fibonacci(1)의 공식을 이용하여 점화식 생성
        for(int i=2; i<=40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for(int i=0; i<T; i++) {
            int idx = Integer.parseInt(br.readLine());
            sb.append(dp[idx][0] + " " + dp[idx][1] + "\n");
        }
        System.out.println(sb);
    }

}
