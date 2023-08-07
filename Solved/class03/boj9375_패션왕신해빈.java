
/*
    백준 - 패션왕 신해빈
    https://www.acmicpc.net/problem/9375
 */

import java.io.*;
import java.util.*;

public class boj9375_패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < K; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String cloth = st.nextToken();
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for (int e : map.values()) {
                result *= (e + 1);
            }
            sb.append(result - 1).append('\n');
        }
        System.out.println(sb);
    }
}
