package solvedAC.class02;

/*
    백준 - 체스판 다시 칠하기
    https://www.acmicpc.net/problem/1018
 */

import java.io.*;
import java.util.*;

public class boj1018_체스판다시칠하기 {
    static int min = Integer.MAX_VALUE;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new char[N][M];

        for (int i = 0; i < N; i++) {
            char[] tmp = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) board[i][j] = tmp[j];
        }

        // 체스판 자르기 8*8
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                getValue(i, j);
            }
        }

        System.out.println(min);

    }

    private static void getValue(int x, int y) {
        int W =0;
        int B =0;

        for(int i=x;i<x+8;i++){
            for(int j=y;j<y+8;j++){
                // 짝수 줄일때
                if(i%2==0){
                    // 짝수 컬럼일때
                    if(j%2==0){
                        if(board[i][j]!='W') W++;
                        else B++;
                    }else{
                        if(board[i][j]!='B') W++;
                        else B++;
                    }
                }
                // 홀수 줄일때
                else {
                    if(j%2==0){
                        if(board[i][j]!='B') W++;
                        else B++;
                    }else{
                        if(board[i][j]!='W') W++;
                        else B++;
                    }
                }
            }
        }
        min = Math.min(min, Math.min(W,B));
    }
}
