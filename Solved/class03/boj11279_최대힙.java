
/*
    백준 - 최대힙
    https://www.acmicpc.net/problem/11279
 */

import java.io.*;
import java.util.*;

public class boj11279_최대힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

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
