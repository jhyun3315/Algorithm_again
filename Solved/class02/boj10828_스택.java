package solvedAC.class02;

/*
    백준 - 스택
    https://www.acmicpc.net/problem/10828
 */

import java.io.*;
import java.util.*;

public class boj10828_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            String str = br.readLine();
            if(str.contains(" ")) {
                StringTokenizer st = new StringTokenizer(str," ");
                if(st.nextToken().equals("push"))  stack.push(Integer.parseInt(st.nextToken()));
            }else if(str.equals("top")) sb.append(stack.isEmpty() ? "-1" : stack.peek()).append('\n');
            else if(str.equals("pop"))  sb.append(stack.isEmpty() ? "-1" : stack.pop()).append('\n');
            else if(str.equals("size")) sb.append(stack.size()).append('\n');
            else if(str.equals("empty")) sb.append(stack.empty() ? '1' : '0').append('\n');
        }

        System.out.println(sb);

    }
}
