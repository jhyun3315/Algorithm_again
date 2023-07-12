package solvedAC.class02;

/*
    백준 - 블랙잭
    https://www.acmicpc.net/problem/2798
 */

import java.io.*;
import java.util.*;

public class boj2798_블랙잭 {
    static int N, M;
    static int Max = Integer.MIN_VALUE;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        combination(new int[3], 0,0);
        System.out.println(Max);

    }

    public static void combination(int[] sel, int start, int dept) {
        if(dept == 3){
            int sum =0;

            for(int i=0;i<3;i++){
                sum += sel[i];
            }

            if(sum < M || sum == M) Max = Math.max(Max, sum);
            return;
        }

        for(int i=start;i<N;i++){
            sel[dept] = arr[i];
            combination(sel, i+1, dept+1);
        }
    }
}
