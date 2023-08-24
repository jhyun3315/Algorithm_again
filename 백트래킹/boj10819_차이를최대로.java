
/*
    백준 - 차이를 최대로
    https://www.acmicpc.net/problem/10819
 */

import java.io.*;
import java.util.*;

public class boj10819_차이를최대로 {
    static int[] arr, sel;
    static int N, max;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        sel = new int[N];
        visited = new boolean[N];
        max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(max);
    }

    public static void dfs(int idx) {
        if (idx == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += (Math.abs(sel[i] - sel[i + 1]));
            }
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sel[idx] = arr[i];
                dfs(idx + 1);
                visited[i] = false;
            }
        }
    }
}
