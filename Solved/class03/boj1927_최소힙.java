
/*
    백준 - 최소힙
    https://www.acmicpc.net/problem/1927
 */

import java.io.*;
import java.util.*;

public class boj1927_최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int curr = Integer.parseInt(br.readLine());
            if (curr == 0) {
                if (pq.size() == 0)
                    sb.append(0).append('\n');
                else
                    sb.append(pq.poll()).append('\n');

            } else
                pq.add(curr);
        }
        System.out.println(sb);
    }
}
