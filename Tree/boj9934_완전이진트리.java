/*
    백준 - 완전 이진 트리
    https://www.acmicpc.net/problem/9934
 */

import java.io.*;
import java.util.*;

public class boj9934_완전이진트리 {
    static StringBuffer[] result;
    static boolean[] visited;
    static int K, cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        // 총 2^k-1개의 노드
        cnt = (int) (Math.pow(2, K) - 1);
        arr = new int[cnt];
        result = new StringBuffer[K];
        for (int i = 0; i < K; i++)
            result[i] = new StringBuffer();

        visited = new boolean[cnt];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        getAnswer(0, cnt - 1, 0);
        StringBuilder sb = new StringBuilder();
        for (StringBuffer str : result)
            sb.append(str).append('\n');
        System.out.println(sb);

    }

    private static void getAnswer(int left, int right, int dept) {
        if (dept == K)
            return;

        int mid = (left + right) / 2;
        result[dept].append(arr[mid]).append(" ");
        getAnswer(left, mid - 1, dept + 1);
        getAnswer(mid + 1, right, dept + 1);

    }
}
