
/*
    백준 - 토마토
    https://www.acmicpc.net/problem/7576
 */

import java.io.*;
import java.util.*;

public class boj7576_토마토 {
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
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] board = new int[N][M];
        int answer = -1;
        int total = M * N;

        Queue<Point> q = new LinkedList<>();
        int curr;

        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int c = 0; c < M; c++) {
                curr = Integer.parseInt(st.nextToken());
                board[r][c] = curr;

                if (curr == 1) {
                    total--;
                    q.add(new Point(r, c));
                }
                if (curr == -1)
                    total--;
            }
        }

        if (q.size() == 0)
            System.out.println(-1);
        else if (total == 0)
            System.out.println(0);
        else {
            while (!q.isEmpty()) {
                int size = q.size();

                for (int s = 0; s < size; s++) {
                    Point p = q.poll();
                    int pr = p.r;
                    int pc = p.c;

                    for (int d = 0; d < 4; d++) {
                        int nr = pr + dr[d];
                        int nc = pc + dc[d];

                        if (nr >= 0 && nr < N && nc >= 0 && nc < M && board[nr][nc] == 0) {
                            board[nr][nc] = 1;
                            q.add(new Point(nr, nc));
                            total--;
                        }
                    }
                }
                answer++;
            }
            if (total != 0)
                System.out.println(-1);
            else
                System.out.println(answer);
        }
    }
}
