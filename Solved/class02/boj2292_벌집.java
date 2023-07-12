package solvedAC.class02;

/*
    백준 - 벌집
    https://www.acmicpc.net/problem/2292
 */

import java.io.*;

public class boj2292_벌집 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int idx = 0;
        int result = 1;

        while(true) {
            result = result + (6 * idx);

            if (result == N || result > N){
                System.out.println(idx+1);
                break;
            }
            idx++;
        }
    }
}
