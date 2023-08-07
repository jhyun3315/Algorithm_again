
/*
    백준 - 봄버맨
    https://www.acmicpc.net/problem/16918
 */

import java.io.*;
import java.util.*;

public class boj16918_봄버맨 {
    static char[][] board;
    static int R, C, N;
    static Queue<Point> q = new LinkedList<>();
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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        board = new char[R][C];

        for (int r = 0; r < R; r++) {
            char[] ch = br.readLine().toCharArray();
            for (int c = 0; c < C; c++) {
                board[r][c] = ch[c];
                if (ch[c] == 'O') {
                    q.add(new Point(r, c));
                }
            }
        }

        for (int time = 2; time <= N; time++) {
            if (time % 2 == 1) {
                for (int r = 0; r < R; r++) {
                    for (int c = 0; c < C; c++) {
                        if (board[r][c] == 'O') {
                            q.add(new Point(r, c));
                        }
                    }
                }
                for (char[] m : board) {
                    Arrays.fill(m, 'O');
                }
                bfs();
            }

            if (N % 2 == 0) {
                for (int r = 0; r < R; r++) {
                    for (int c = 0; c < C; c++) {
                        if (board[r][c] == '.') {
                            board[r][c] = 'O';
                        }
                    }
                }
            }
        }

        for (int r = 0; r < R; r++) {
            System.out.println(board[r]);
        }

    }

    private static void bfs() {
        while (!q.isEmpty()) {
            Point p = q.poll();
            int pr = p.r;
            int pc = p.c;

            board[pr][pc] = '.';

            for (int d = 0; d < 4; d++) {
                int nr = pr + dr[d];
                int nc = pc + dc[d];

                if (nr >= 0 && nr < R && nc >= 0 && nc < C && board[nr][nc] == 'O') {
                    board[nr][nc] = '.';
                }
            }
        }
    }

}
