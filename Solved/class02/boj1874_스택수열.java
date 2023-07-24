package solved.class02;

/*
    백분 - 스택 수열
    https://www.acmicpc.net/problem/1874
 */


import java.io.*;
import java.util.*;

public class boj1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int curr;
        int idx = 0;
        boolean check = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            curr = Integer.parseInt(br.readLine());

            // 스택에 값이 있고 pop값과 입력값이 동일할때
            if (!stack.isEmpty() && stack.peek() == curr) {
                // 최근 푸시한 숫자가 입력받은 값보다 작은경우
                stack.pop();
                sb.append('-').append('\n');
            }else if (idx < curr) {
                // idx+1부터 curr까지 푸시함
                for (int p = idx + 1; p <= curr; p++) {
                    stack.push(p);
                    sb.append('+').append('\n');
                }
                stack.pop();
                sb.append('-').append('\n');
                idx = curr;

            } else {
                check = true;
                System.out.println("NO");
                break;
            }

        }
        if(!check)  System.out.println(sb);
    }
}
