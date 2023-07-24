package solved.class02;
/*
    백준 - 마인크래프트
    https://www.acmicpc.net/problem/18111

    블록을 인벤토리에 넣는것 - 2초
    인벤토리에서 블록을 꺼내 좌표상 위치에 놓는것 - 1초
    땅고르기 작업의 최소 시간과 그 높이 출력
 */

import java.io.*;
import java.util.*;

public class boj1811_마인크래프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int curr;

        int[][] board = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<M;j++){
                curr = Integer.parseInt(st.nextToken());
                board[i][j] = curr;
                min = Math.min(min, curr);
                max = Math.max(max, curr);
            }
        }

        int count = Integer.MAX_VALUE;
        int height = 0;

        for(int i=min;i<=max;i++){
            int tmpCount =0;
            int inven = B;

            for(int r=0;r<N;r++) {
                for (int c = 0; c < M; c++) {
                    curr = board[r][c];

                    if (i < curr) {
                        tmpCount += (curr - i)*2;
                        inven+=(curr - i);
                    }
                    else {
                        tmpCount += (i - curr) ;
                        inven-=(i - curr);
                    }
                }
            }
            if(inven < 0) break;
            else if( count >= tmpCount ){
                count = tmpCount;
                height = i;
            }
        }
        sb.append(count).append(' ').append(height);
        System.out.println(sb);
    }
}
