package solvedAC.class02;

/*
    백준 - 최대공약수와 최소공배수
    https://www.acmicpc.net/problem/2609
 */

import java.io.*;
import java.util.*;


public class boj2609_최대공약수와_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int max = gdc(N,M);

        System.out.println(max);
        System.out.println(N*M/max);

    }

    public static int gdc(int a, int b){
        if(b == 0) return a;
        return gdc(b, a % b);
    }
}
