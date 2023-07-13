package solvedAC.class02;

/*
    백준 - 부녀회장이 될테야
    https://www.acmicpc.net/problem/2775
 */

import java.io.*;

public class boj2775_부녀화장이_될테야 {
    static int[][] apt = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int k,r;

        for (int i = 0; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                if(i==0) apt[i][j] = j;
                else apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        for(int t=0;t<T;t++){
            k = Integer.parseInt(br.readLine());
            r = Integer.parseInt(br.readLine());

            System.out.println(apt[k][r]);
        }
    }

}
