package Tree;
/*
    백준 - 트리
    https://www.acmicpc.net/problem/1068
 */

import java.io.*;
import java.util.*;

public class boj1068_트리 {
    static ArrayList<Integer>[] tree;
    static int K, cnt, root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N];
        root=0;
        for(int i=0;i<N;i++) tree[i] = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int curr;
        for(int i=0;i<N;i++){
            curr = Integer.parseInt(st.nextToken());
            if(curr == -1) root =i;
            else tree[curr].add(i);
        }
        cnt = 0;
        K = Integer.parseInt(br.readLine());

        DFS(root);

        sb.append(cnt);
        System.out.println(sb);

    }

    public static void DFS(int idx) {
        if(idx == K) {
            return;
        }

        int size = tree[idx].size();
        if(tree[idx].contains(K) && size == 1){
            cnt++;
            return;
        }
        if(size == 0) {
            cnt++;
            return;
        }

        for(int e : tree[idx]) DFS(e);
    }
}
