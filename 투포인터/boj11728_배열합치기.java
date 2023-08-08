/*
    백준 - 배열 합치기
    https://www.acmicpc.net/problem/11728
 */

import java.io.*;
import java.util.*;

public class boj11728_배열합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] result = new int[N + M];

        st = new StringTokenizer(br.readLine(), " ");
        for (int a = 0; a < N; a++)
            result[a] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int b = N; b < N + M; b++)
            result[b] = Integer.parseInt(st.nextToken());

        Arrays.sort(result);
        for (int e : result)
            System.out.print(e + " ");

    }
}
