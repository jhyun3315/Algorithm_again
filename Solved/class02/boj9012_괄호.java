package solvedAC.class02;

/*
    백준 - 괄호
    https://www.acmicpc.net/problem/9012
 */

import java.io.*;
import java.util.*;

public class boj9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            Stack<Character> stack = new Stack<>();
            String result = "YES";
            for(char c : br.readLine().toCharArray()){
                if(c == '(') stack.push('(');
                else{
                    if(stack.isEmpty()) {
                        result ="NO";
                        break;
                    }

                    char ch = stack.pop();
                    if(ch !='('){
                        result = "NO";
                        break;
                    }
                }
            }

            if(!stack.isEmpty()) result = "NO";
            System.out.println(result);
        }

    }
}
