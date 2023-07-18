package solvedAC.class02;

/*
    백준 - 덱
    https://www.acmicpc.net/problem/10866
 */

import java.io.*;
import java.util.*;

public class boj10866_덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            String str = br.readLine();

            if(str.contains(" ")) {
                StringTokenizer st = new StringTokenizer(str, " ");
                str = st.nextToken();

                if (str.equals("push_front")) deq.addFirst(Integer.parseInt(st.nextToken()));
                else if (str.equals("push_back")) deq.addLast(Integer.parseInt(st.nextToken()));
            }
            else
            {
                switch (str) {
                    case "pop_front":
                        sb.append(deq.isEmpty() ? "-1" : deq.pollFirst()).append('\n');
                        break;
                    case "pop_back":
                        sb.append(deq.isEmpty() ? "-1" : deq.pollLast()).append('\n');
                        break;
                    case "size":
                        sb.append(deq.size()).append('\n');
                        break;
                    case "empty":
                        sb.append(deq.isEmpty() ? "1" : "0").append('\n');
                        break;
                    case "front":
                        sb.append(deq.isEmpty() ? "-1" : deq.peekFirst()).append('\n');
                        break;
                    case "back":
                        sb.append(deq.isEmpty() ? "-1" : deq.peekLast()).append('\n');
                        break;
                }
            }

        }

        System.out.println(sb);
    }
}
