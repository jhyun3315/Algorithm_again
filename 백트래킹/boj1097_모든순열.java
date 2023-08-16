
/*
    백준- 모든 순열
    https://www.acmicpc.net/problem/10974
 */

import java.io.*;

public class boj1097_모든순열 {
    static int[] arr;
    static boolean[] visit;
    static int n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        visit = new boolean[n];
        arr = new int[n];
        back(0);
        System.out.println(sb);
    }

    static void back(int depth) {
        if (depth == n) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                back(depth + 1);
                visit[i] = false;
            }
        }
    }
}
