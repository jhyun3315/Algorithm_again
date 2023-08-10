
/*
    백준 - 계란으로 계란치기
    https://www.acmicpc.net/problem/16987
 */

import java.io.*;
import java.util.*;

public class boj16987_계란으로계란치기 {
    static int max, N;
    static int[][] egg;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        egg = new int[N][2]; // 내구도와 무게
        max = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            egg[i][0] = Integer.parseInt(st.nextToken());
            egg[i][1] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(max);

    }

    public static void dfs(int dept, int cnt) {
        if (dept == N)
            return;

        for (int i = 0; i < N; i++) {
            if (i == dept || egg[i][0] <= 0)
                continue;
            if (egg[dept][0] <= 0) {
                dfs(dept + 1, cnt);
                return;
            }
            egg[dept][0] -= egg[i][1];
            egg[i][0] -= egg[dept][1];
            int nCnt = 0;

            if (egg[dept][0] <= 0)
                nCnt++;
            if (egg[i][0] <= 0)
                nCnt++;

            max = Math.max(max, cnt + nCnt);
            dfs(dept + 1, cnt + nCnt);
            egg[i][0] += egg[dept][1];
            egg[dept][0] += egg[i][1];
        }
    }
}
