package solvedAC.class02;

/*
    백준 - 균형잡힌 세상
    https://www.acmicpc.net/problem/4949
 */

import java.io.*;
import java.util.*;

public class boj4949_균형잡힌_세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line ="";

        while(!(line = br.readLine()).equals(".")){
            Stack<Character> stack = new Stack<>();
            String result = "yes";

            for(char c : line.toCharArray()){
                if(c=='(' || c=='[') stack.push(c);
                else if(c==')' || c==']'){
                    if(stack.isEmpty()){
                        result = "no";
                        break;
                    }

                    char ch = stack.peek();

                    if(c==')' && ch=='(') stack.pop();
                    else if(c ==']' && ch=='[') stack.pop();
                    else {
                        result = "no";
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) result = "no";
            System.out.println(result);
        }
    }
}
