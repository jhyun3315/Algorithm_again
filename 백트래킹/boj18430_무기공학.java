
import java.io.*;
import java.util.*;

public class boj18430_무기공학 {
    static int N, M, max;
    static int[][] board;
    static int[] dr = { 0, 0, 1, 1 };
    static int[] dc = { 0, 1, 1, 0 };
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        visited = new boolean[N][M];

        max = 0;

        if (N * M >= 4) {
            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int c = 0; c < M; c++) {
                    board[r][c] = Integer.parseInt(st.nextToken());
                }
            }
            dfs(0, 0, 0);
        }
        System.out.println(max);
    }

    public static void dfs(int r, int c, int sum) {
        if (r == N - 1) {
            System.out.println("sum: " + sum);
            max = Math.max(sum, max);
            return;
        }

        if (c == M - 1)
            dfs(r + 1, 0, sum);
        else if (!visited[r][c]) {
            Loop1: for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc]) {
                    int nsum = 0;
                    int cnt = 0;

                    for (int dd = 0; dd < 3; dd++) {
                        int rr = nr + dr[(d + dd) % 4];
                        int cc = nc + dc[(d + dd) % 4];

                        if (rr >= 0 && rr < N && cc >= 0 && cc < M) {
                            if (visited[rr][cc]) {
                                for (int x = 1; x < dd + 1; x++) {
                                    int xr = rr - x;
                                    int xc = cc - x;
                                    if (xr < 0)
                                        xr += (N);
                                    if (xc < 0)
                                        xc += (M);
                                    visited[xr][xc] = false;
                                }
                                continue Loop1;
                            } else {
                                cnt++;
                                nsum += board[rr][cc];
                                if (dd == 1)
                                    nsum += board[rr][cc];
                                visited[rr][cc] = true;
                                System.out.print(rr + "," + cc + " :" + cnt + " ");
                            }
                        }
                    }
                    System.out.println();
                    if (cnt == 3) {
                        dfs(r, c + 1, sum + nsum);
                        reverse(d, nr, nc);
                    }
                }
            }
        }
    }

    public static void reverse(int start, int r, int c) {
        for (int d = start; d < start + 3; d++) {
            int nr = r + dr[d % 4];
            int nc = c + dc[d % 4];

            if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                visited[nr][nc] = false;
            }
        }
    }
}
