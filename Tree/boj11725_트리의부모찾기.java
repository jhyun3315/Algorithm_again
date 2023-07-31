/*
 *  백준 - 트리의 부모 찾기
 *  https://www.acmicpc.net/problem/11725
 */

import java.io.*;
import java.util.*;

public class boj11725_트리의부모찾기 {
    static int[] parent;
    static boolean[] visited;
    static ArrayList<Integer> tree[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        parent = new int[N + 1];
        visited = new boolean[N + 1];
        tree = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int nodeA = Integer.parseInt(st.nextToken());
            int nodeB = Integer.parseInt(st.nextToken());

            tree[nodeA].add(nodeB);
            tree[nodeB].add(nodeA);
        }

        DFS(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++)
            sb.append(parent[i]).append('\n');
        System.out.println(sb);

    }

    private static void DFS(int index) {
        visited[index] = true;
        for (int e : tree[index]) {
            if (!visited[e]) {
                parent[e] = index;
                DFS(e);
            }
        }
    }
}
