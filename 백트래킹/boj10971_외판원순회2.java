
/*
    백준 - 외판원 순회 2
    https://www.acmicpc.net/problem/10971
 */

import java.io.*;
import java.util.*;

public class boj10971_외판원순회2 {
    static int answer = Integer.MAX_VALUE;
    static int N;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        int curr;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            boolean[] visited = new boolean[N];
            visited[i] = true;
            DFS(i, 0, i, visited, 0);
        }
        System.out.println(answer);
    }

    private static void DFS(int start, int dept, int idx, boolean[] visited, int sum) {
        if (dept == N - 1) {
            int curr = arr[idx][start];
            if (curr != 0) {
                answer = Math.min(answer, sum + arr[idx][start]);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && arr[idx][i] != 0) {
                visited[i] = true;
                DFS(start, dept + 1, i, visited, sum + arr[idx][i]);
                visited[i] = false;
            }
        }
    }
}
