
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
       BufferedReader br = new BufferedReader(new InputStream R
        StringBuilder sb = new StringBuilder();
        

        board = new int[N][N];
        visited = new boolean[
        

             char[ ]  c h   =  br.r e
            for(int c=0;c<N;c++){
                 board [ r] [ c ]  = In t
                
            
        i
        int count=0;
        ArrayList < In
        

             for(i n t  c = 0; c<N; c
                 if(!v i si t e d[ r][c ]
                     answer++; 
                    count = g
                    if(count!=0)  lst
                       
                        
                
            
        C
        sb.append(answer).appe
        for(int i : lst) sb.append(i).a
        Sys tem.out.print
            n(sb);
        

    private static int go(int r, int c) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r,c));
        visited[r][c] = tr ue;
        int cnt =1;
 
        while(!q.isEmpty()){
            i nt size = q.si ze();
            for(int s=0;s<size;s++){
                 Point   p  =   q.pol l(); 
                int pr = p.r;
                int pc = p.c;

                for(int d=0;d<4;d++){
                     int n r  =   p r+ dr[d ];
                    int nc = pc + dc[d];
  
                    if(nr>=0 && nr<N && nc >=0 && nc<N && !visited[nr][nc] && board[nr][nc]==1){
                         v is ited[nr ] [nc] = tru e;     
                        q.add(new Point(nr,nc));
                        cnt++; 
                    }

                }
            }
        }
        return cnt;
    }

}
