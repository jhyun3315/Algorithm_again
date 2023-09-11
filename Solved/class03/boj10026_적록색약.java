/*
 *  백준 - 적록색약
 *  https://www.acmicpc.net/problem/10026
 */

import java.io.*;
import java.util.*;

public class boj10026_적록색약 {
    static int N, ans_nor, ans_redGreen;
    static char[][] board_normal;
    static char[][] board_redGreen;
    static boolean[][] visited_normal;
    static boolean[][] visited_redGreen;
    static int[] dr = { -1, 0, 1, 0 };
    static int[] dc = { 0, 1, 0, -1 };

    static class Point {
        int r, c;
        char cls;

        public Point(int r, int c, char cls) {
            this.r = r;
            this.c = c;
            this.cls = cls;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board_normal = new char[N][N];
        board_redGreen = new char[N][N];
        visited_normal = new boolean[N][N];
        visited_redGreen = new boolean[N][N];
        ans_nor = 0;
        ans_redGreen = 0;

        for (int r = 0; r < N; r++) {
            char[] ch = br.readLine().toCharArray();
            for (int c = 0; c < N; c++) {
                char curr = ch[c];
                board_normal[r][c] = curr;
                if (curr == 'G')
                    board_redGreen[r][c] = 'R';
                else
                    board_redGreen[r][c] = curr;
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (!visited_normal[r][c]) {
                    BFS(r, c, true);
                }

                if (!visited_redGreen[r][c]) {
                    BFS(r, c, false);
                }
            }
        }
        System.out.println(ans_nor + " " + ans_redGreen);
    }

    public static void BFS(int r, int c, boolean check) {
        Queue<Point> q = new LinkedList<>();
        if (check) {
            q.add(new Point(r, c, board_normal[r][c]));
            visited_normal[r][c] = true;
        } else {
            q.add(new Point(r, c, board_redGreen[r][c]));
            visited_redGreen[r][c] = true;
        }

        while (!q.isEmpty()) {
            Point p = q.poll();
            int pr = p.r;
            int pc = p.c;
            char pCls = p.cls;

            for (int d = 0; d < 4; d++) {
                int nr = pr + dr[d];
                int nc = pc + dc[d];

                if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                    if (check && !visited_normal[nr][nc] && board_normal[nr][nc] == pCls) {
                        visited_normal[nr][nc] = true;
                        q.add(new Point(nr, nc, pCls));
                    } else if (!check && !visited_redGreen[nr][nc] && board_redGreen[nr][nc] == pCls) {
                        visited_redGreen[nr][nc] = true;
                        q.add(new Point(nr, nc, pCls));
                    }

                }
            }
        }

        if (check)
            ans_nor++;
        else
            ans_redGreen++;

    }
}
