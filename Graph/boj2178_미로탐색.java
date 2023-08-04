package 알고리즘_공부.Graph;

/*
    백준 - 미로 탐색
    https://www.acmicpc.net/problem/2178
 */

import java.io.*;
import java.util.*;

public class boj2178_미로탐색 {
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static char[] ch;

    static class Point{
        int r;
        int c;
        int cnt;

        Point(int r, int c, int cnt){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = Integer.MAX_VALUE;

        int[][] board = new int[N][M];
        for(int r=0;r<N;r++){
            ch = br.readLine().toCharArray();
            for(int c=0;c<M;c++){
                board[r][c] = Integer.parseInt(String.valueOf(ch[c]));
            }
        }

        boolean[][] visited = new boolean[N][M];
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0,0,1));
        visited[0][0] = true;

        while(!q.isEmpty()){
            int size = q.size();

            for(int s=0;s<size;s++){
                Point p = q.poll();
                int r = p.r;
                int c = p.c;
                int cnt = p.cnt;


                for(int d=0;d<4;d++){
                    int nr = r+dr[d];
                    int nc = c+dc[d];

                    if(nr==N-1 && nc ==M-1){
                        answer = Math.min(cnt+1, answer);
                    }

                    if(nr>=0 && nr<N && nc>=0 && nc<M && board[nr][nc] ==1 && !visited[nr][nc]){
                        visited[nr][nc] = true;
                        q.add(new Point(nr,nc, cnt+1));
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
