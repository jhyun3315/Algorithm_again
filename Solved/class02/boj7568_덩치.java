package solvedAC.class02;

/*
    백준 - 덩치
    https://www.acmicpc.net/problem/7568
*/

import java.io.*;
import java.util.*;

public class boj7568_덩치 {

    static class Dum {
        int length;
        int weigth;
        int idx;

        public Dum(int length, int weigth, int idx) {
            this.length = length;
            this.weigth = weigth;
            this.idx = idx;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            int rank = 1;
            for(int j=0;j<N;j++){
                if(i==j) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }

            sb.append(rank).append(' ');
        }

        System.out.println(sb);
    }
}
