
/*
    백준 - 로마 숫자 만들기
    https://www.acmicpc.net/problem/16922
 */

import java.io.*;

public class boj16922_로마숫자만들기 {
    static int N, answer;
    static int[] sel;
    static int[] lst = { 1, 5, 10, 50 };
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        answer = 0;
        sel = new int[N];
        visited = new boolean[1001];

        dfs(0, 0, 0);
        System.out.println(answer);

    }

    public static void dfs(int idx, int dept, int sum) {
        if (dept == N) {
            if (!visited[sum]) {
                answer++;
                visited[sum] = true;
            }
            return;
        }
        for (int i = idx; i < 4; i++) {
            dfs(i, dept + 1, sum + lst[i]);
        }
    }
}
