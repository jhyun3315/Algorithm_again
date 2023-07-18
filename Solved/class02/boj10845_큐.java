package solvedAC.class02;

/*
    백준 - 큐
    https://www.acmicpc.net/problem/10845
 */

import java.io.*;
import java.util.*;

public class boj10845_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            String str = br.readLine();
            if(str.contains(" ")){
                StringTokenizer st = new StringTokenizer(str, " ");
                if(st.nextToken().equals("push")) q.offer(Integer.parseInt(st.nextToken()));
            }else if(str.equals("front")) sb.append(q.isEmpty() ? "-1" : q.peek()).append('\n');
            else if(str.equals("pop")) sb.append(q.isEmpty()? "-1" : q.poll()).append('\n');
            else if(str.equals("size")) sb.append(q.size()).append('\n');
            else if(str.equals("empty")) sb.append(q.isEmpty() ? '1' : '0').append('\n');
            else if(str.equals("back")) sb.append(q.isEmpty()  ? "-1" : q.getLast()).append('\n');

        }

        System.out.println(sb);

    }
}
