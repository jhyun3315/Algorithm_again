package solvedAC.class02;

/*
    백준 - 영화감독 숌
    https://www.acmicpc.net/problem/1436
 */

import java.io.*;

public class boj1436_영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);

    }
}
