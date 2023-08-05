
/*
    백준 - 에라토스테네스의 체
    https://www.acmicpc.net/problem/2960
 */

import java.io.*;
import java.util.StringTokenizer;

public class boj2960_에라토스테네스의체 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        arr[0] = 1;
        arr[1] = 1;

        int cnt = 0;

        for (int i = 2; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                if (arr[j] == 0) {
                    arr[j] = 1;
                    cnt++;
                }

                if (cnt == K) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }

}
