package 알고리즘_공부.분할정복;

/*
    백준 - 색종이 만들기
    https://www.acmicpc.net/problem/2630
 */

import java.io.*;
import java.util.*;

public class boj2630_색종이만들기 {
    static int blue, white;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for(int r=0;r<N;r++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int c=0;c<N;c++){
                board[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        blue = 0;
        white = 0;

        divide(0,0, N);
        System.out.println(white);
        System.out.println(blue);

    }

    private static void divide(int r, int c, int size) {
         if(check(r,c,size)){
             if(board[r][c] == 0) white++;
             else blue++;
             return;
         }
         int nSize = size/2;
         divide(r,c,nSize);
         divide(r,c+nSize, nSize);
         divide(r+nSize,c,nSize);
         divide(r+nSize, c+nSize,nSize);
    }

    private static boolean check(int r, int c, int size) {
        int color = board[r][c];

        for(int i=r;i<r+size;i++){
            for(int j=c;j<c+size;j++){
                if(board[i][j] != color) return false;
            }
        }
        return true;
    }

}
