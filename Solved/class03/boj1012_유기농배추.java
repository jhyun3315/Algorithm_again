/*
    백준 - 유기농 배추
    https://www.acmicpc.net/problem/1012
 */

import java.io.*;
import java.util.*;

public class boj1012_유기농배추 {
    static int[][] board;
    static int N, M;
    static boolean[][] visited;
    static int[] dr = { -1, 0, 1, 0 };
    static int[] dc = { 0, 1, 0, -1 };

    static class Point {
        int r, c;

        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken()); // 가로
            N = Integer.parseInt(st.nextToken()); // 세로
            int K = Integer.parseInt(st.nextToken()); // 배추 개수

            board = new int[M][N];
            visited = new boolean[M][N];
            int cnt = 0;

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                board[n][m] = 1;
            }
            for (int r = 0; r < M; r++) {
                for (int c = 0; c < N; c++) {
                    if (!visited[r][c] && board[r][c] == 1) {
                        cnt++;
                        getValue(r, c);
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.print(sb);
    }

    public static void getValue(int r, int c) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r, c));
        visited[r][c] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();
            int pr = p.r;
            int pc = p.c;

            for (int d = 0; d < 4; d++) {
                int nr = pr + dr[d];
                int nc = pc + dc[d];

                if (nr >= 0 && nr < M && nc >= 0 && nc < N && !visited[nr][nc] && board[nr][nc] == 1) {
                    visited[nr][nc] = true;
                    q.add(new Point(nr, nc));
                }
            }

        }
    }

}
