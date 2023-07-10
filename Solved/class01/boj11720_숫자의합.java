package solvedAC.class01;

import java.io.*;

/*
    백준 - 숫자의 합
    https://www.acmicpc.net/problem/2439
 */
public class boj11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int sum =0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sum);
    }
}
