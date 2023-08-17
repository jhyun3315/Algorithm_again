/*
    백준 - 근손실
    https://www.acmicpc.net/problem/18429
 */

import java.io.*;
import java.util.StringTokenizer;

public class boj18429_근손실 {
    static int N, K, answer;
    static int[] kg;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        kg = new int[N];
        visited = new boolean[N];
        answer = 0;
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            kg[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 500);
        System.out.println(answer);

    }

    public static void dfs(int idx, int curr) {
        if (idx == N) {
            answer++;
            return;
        }

        for (int i = 0; i < N; i++) {
            int tmp = curr + kg[i] - K;
            if (!visited[i] && tmp >= 500) {
                visited[i] = true;
                dfs(idx + 1, tmp);
                visited[i] = false;
            }
        }
    }
}
