package solvedAC.class02;

/*
    백준 - 팩토리얼 0의 개수
    https://www.acmicpc.net/problem/1676
 */

import java.io.*;

public class boj1676_팩토리얼0의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while (N >= 5) {
            count += N / 5;
            N /= 5;
        }
        System.out.println(count);

    }
}
