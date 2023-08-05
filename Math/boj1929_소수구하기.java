
/*
    백준 - 소수 구하기
    https://www.acmicpc.net/problem/1929
 */

import java.io.*;
import java.util.StringTokenizer;

public class boj1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= N; i++) {
            for (int j = i + i; j <= N; j += i) {
                if (arr[j] == 0) {
                    arr[j] = 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = M; i <= N; i++) {
            if (arr[i] == 0)
                sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
