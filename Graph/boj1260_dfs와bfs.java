
/*
    백준 - DFS와 BFS
    https://www.acmicpc.net/problem/1260
 */

import java.io.*;
import java.util.*;

public class boj1260_dfs와bfs {
    static ArrayList<Integer>[] lst;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        lst = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++)
            lst[i] = new ArrayList<>();

        int j1;
        int j2;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            j1 = Integer.parseInt(st.nextToken());
            j2 = Integer.parseInt(st.nextToken());

            lst[j1].add(j2);
            lst[j2].add(j1);
        }

        for (int i = 0; i <= N; i++)
            Collections.sort(lst[i]);

        DFS(V, new boolean[N + 1]);
        System.out.println();
        BFS(V, new boolean[N + 1]);

    }

    public static void DFS(int idx, boolean[] visited) {
        if (visited[idx]) {
            return;
        }
        visited[idx] = true;
        System.out.print(idx + " ");
        for (int e : lst[idx]) {
            DFS(e, visited);
        }
    }

    public static void BFS(int idx, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int s = 0; s < size; s++) {
                int nidx = q.poll();

                if (visited[nidx])
                    continue;

                visited[nidx] = true;
                System.out.print(nidx + " ");

                for (int i = 0; i < lst[nidx].size(); i++) {
                    int curr = lst[nidx].get(i);
                    if (!visited[curr])
                        q.add(curr);
                }
            }
        }
    }

}
