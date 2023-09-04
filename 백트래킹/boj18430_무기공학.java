/*
    백준 - 무기 공학
    https://www.acmicpc.net/problem/18430
 */

import java.io.*;
import java.util.*;

public class boj18430_무기공학 {
    static int N, M, max;
    static int[][] board;
    static int[][][] move = {
            { { 0, -1 }, { 1, 0 } },
            { { -1, 0 }, { 0, -1 } },
            { { -1, 0 }, { 0, 1 } },
            { { 0, 1 }, { 1, 0 } }
    };
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[6][6];
        visited = new boolean[6][6];

        max = 0;

        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int c = 0; c < M; c++) {
                board[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0, 0);
        System.out.println(max);
    }

    public static void dfs(int r, int c, int sum) {
        if (c == M) {
            c = 0;
            r++;
        }

        if (r == N) {
            max = Math.max(max, sum);
            return;
        }

        if (!visited[r][c]) {
            for (int d = 0; d < 4; d++) {
                int nr1 = r + move[d][0][0];
                int nc1 = c + move[d][0][1];
                int nr2 = r + move[d][1][0];
                int nc2 = c + move[d][1][1];

                if (nr1 >= 0 && nr2 >= 0 && nr1 < N && nr2 < N && nc1 >= 0 && nc2 >= 0 && nc1 < M && nc2 < M) {
                    if (visited[nr1][nc1] || visited[nr2][nc2])
                        continue;

                    visited[nr1][nc1] = true;
                    visited[nr2][nc2] = true;
                    visited[r][c] = true;

                    dfs(r, c + 1, sum + (board[r][c] * 2) + board[nr1][nc1] + board[nr2][nc2]);
                    visited[r][c] = false;
                    visited[nr1][nc1] = false;
                    visited[nr2][nc2] = false;
                }

            }
        }
        dfs(r, c + 1, sum);
    }
}
