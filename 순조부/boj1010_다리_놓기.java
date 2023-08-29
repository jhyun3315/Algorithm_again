import java.io.*;
import java.util.*;

/*
    백준 - 다리놓기
    https://www.acmicpc.net/problem/1010
 */

public class boj1010_다리_놓기 {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =  Integer.parseInt(br.readLine());
        dp = new int[30][30];

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            System.out.println(Combination(N, R));
        }
    }
    public static int Combination(int n, int r){
        if(dp[n][r] > 0) return dp[n][r];
        if(n==r || r==0) return dp[n][r] =1;
        return dp[n][r] = Combination(n-1,r-1) + Combination(n-1, r);
    }

}
