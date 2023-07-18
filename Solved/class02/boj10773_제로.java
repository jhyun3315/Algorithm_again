package solvedAC.class02;

/*
    백준 - 제로
    https://www.acmicpc.net/problem/10773
 */

import java.io.*;
import java.util.*;

public class boj10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int curr;
        int sum =0;

        for(int i=0;i<K;i++){
            curr= Integer.parseInt(br.readLine());
            sum+=curr;
            if(curr !=0) stack.push(curr);
            else {
                sum-=stack.pop();
            }
        }

        System.out.println(sum);

    }
}
