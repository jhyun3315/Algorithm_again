package solvedAC.class02;

/*
    백준 - 카드2
    https://www.acmicpc.net/problem/2164
 */

import java.io.*;
import java.util.*;

public class boj2164_카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=N;i++) q.offer(i);

        while(q.size()>1){
            // 맨위에 카드를 버림
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}
