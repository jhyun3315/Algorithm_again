package solvedAC.class02;

/*
    백준 - 이항 계수1
    https://www.acmicpc.net/problem/11050
 */

import java.io.*;
import java.util.StringTokenizer;

public class boj11050_이항계수1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(getValue(N,K));

    }

    public static int getValue(int n, int k){
        if( k==0 || n==k) return 1;
        else return getValue(n-1,k-1) + getValue(n-1,k);
    }
}
