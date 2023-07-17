package solvedAC.class02;

/*
    백준 - 요세푸스 문제 0
    https://www.acmicpc.net/problem/11866
 */

import java.io.*;
import java.util.*;

public class boj11866_요세푸스문제0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(q.size() > 1) {
            for(int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append('>');
        System.out.println(sb);

    }
}
