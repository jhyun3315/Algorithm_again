package solvedAC.class02;

/*
    백준 - 설탕 배달
    https://www.acmicpc.net/problem/2839
 */

import java.io.*;

public class boj2839_설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;

        for(int i=0;i<=N/5;i++){

            if((N-(i*5))%3 ==0) {
                min = Math.min(min, i+(N-(i*5))/3);
            }
        }

        if(min == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(min);
    }
}
