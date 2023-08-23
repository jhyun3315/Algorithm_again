
/*
    백준 - 영재의 시험
    https://www.acmicpc.net/problem/19949
 */

import java.io.*;
import java.util.*;

public class boj19949_영재의시험 {
    static int[] answer;
    static int[] sel;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        answer = new int[10];
        sel = new int[10];
        cnt = 0;

        for (int i = 0; i < 10; i++) {
            answer[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(cnt);
    }

    private static void dfs(int idx) {
        if (idx == 10) {
            int score = 0;
            for (int i = 0; i < 10; i++) {
                if (answer[i] == sel[i])
                    score++;
                if (score >= 5) {
                    cnt++;
                    return;
                }
            }
            return;
        }

        for (int i = 1; i < 6; i++) {
            if (idx >= 2 && sel[idx - 1] == i && sel[idx - 2] == i)
                continue;
            sel[idx] = i;
            dfs(idx + 1);
        }
    }
}
