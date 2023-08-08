
/*
    백준 - 부분수열의 합
    https://www.acmicpc.net/problem/1182
 */

import java.io.*;
import java.util.*;

public class boj1182_부분수열의합 {
    static int[] arr;
    static int answer, N, S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        answer = 0;
        getValue(0, 0);
        if (S == 0)
            System.out.println(answer - 1);
        else
            System.out.println(answer);
    }

    private static void getValue(int idx, int sum) {
        if (idx == N) {
            if (sum == S)
                answer++;
            return;
        }
        getValue(idx + 1, sum + arr[idx]);
        getValue(idx + 1, sum);
    }
}
