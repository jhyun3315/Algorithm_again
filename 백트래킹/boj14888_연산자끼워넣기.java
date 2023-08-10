
/*
    백준 - 연산자 끼워넣기
    https://www.acmicpc.net/problem/14888
 */

import java.io.*;
import java.util.*;

public class boj14888_연산자끼워넣기 {
    static int max;
    static int min;
    static int[] num;
    static int[] oper = new int[4];
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num = new int[N];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            oper[i] = Integer.parseInt(st.nextToken());
        }

        dfs(num[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int sum, int idx) {
        if (idx == N) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (oper[i] > 0) {
                oper[i]--;

                if (i == 0)
                    dfs(sum + num[idx], idx + 1);
                else if (i == 1)
                    dfs(sum - num[idx], idx + 1);
                else if (i == 2)
                    dfs(sum * num[idx], idx + 1);
                else
                    dfs(sum / num[idx], idx + 1);

                oper[i]++;
            }
        }
    }
}
