
/*
    백준 - 바이러스
    https://www.acmicpc.net/problem/2606
 */

import java.io.*;
import java.util.*;

public class boj2606_바이러스 {
    static ArrayList<Integer>[] lst;
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        lst = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++)
            lst[i] = new ArrayList<>();
        int node1;
        int node2;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            node1 = Integer.parseInt(st.nextToken());
            node2 = Integer.parseInt(st.nextToken());
            lst[node1].add(node2);
            lst[node2].add(node1);
        }
        answer = 0;
        getValue(1, new boolean[N + 1]);
        System.out.println(answer);
    }

    private static void getValue(int idx, boolean[] visited) {
        if (visited[idx]) {
            return;
        }
        if (idx != 1) {
            visited[idx] = true;
            answer++;
        }

        for (int e : lst[idx]) {
            getValue(e, visited);
        }
    }
}
