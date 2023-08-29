
/*
    백준 - 단지번호붙이기
    https://www.acmicpc.net/problem/2667
 */

import java.io.*;
import java.util.*;

public class boj2667_단지번호붙이기 {
    static boolean[][] visited;
    static int[] dr = {-1,0,1,0};
    static int[] dc = { 0,1 ,0 ,- 1 };
    static int N;     
    static int[][] board;

    static class Point{
        int r, c; 

        Point(int r, int c){
            this.r = r; 
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        visited = new boolean[N][N];

        for(int r=0;r<N;r++){
            char[] ch = br.readLine().toCharArray();
            for(int c=0;c<N;c++){
                board[r][c] = Integer.parseInt(String.valueOf(ch[c]));
            }
        }
        int answer = 0;
        int count=0;
        ArrayList<Integer> lst = new ArrayList<>();

        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                if(!visited[r][c] && board[r][c] == 1){
                    answer++;
                    count = go(r,c);
                    if(count!=0) lst.add(count);
                }
            }
        }
        Collections.sort(lst);
        sb.append(answer).append('\n');
        for(int i : lst) sb.append(i).append('\n');
        System.out.println(sb);
    }

    private static int go(int r, int c) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r,c));
        visited[r][c] = true;
        int cnt =1;

        while(!q.isEmpty()){
            int size = q.size();
            for(int s=0;s<size;s++){
                Point p = q.poll();
                int pr = p.r;
                int pc = p.c;

                for(int d=0;d<4;d++){
                    int nr = pr+dr[d];
                    int nc = pc+dc[d];

                    if(nr>=0 && nr<N && nc >=0 && nc<N && !visited[nr][nc] && board[nr][nc]==1){
                        visited[nr][nc] = true;
                        q.add(new Point(nr,nc));
                        cnt++;
                    }

                }
            }
        }
        return cnt;
    }
}