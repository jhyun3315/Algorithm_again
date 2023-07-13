package solvedAC.class02;

/*
    백준 - Hashing
    https://www.acmicpc.net/problem/15829
 */

import java.io.*;

public class boj15829_Hashing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        long answer = 0;
        long curr = 1;

        for(int i=0;i<N;i++){
            answer += ((arr[i]-96)*curr);
            curr = (curr*31) %1234567891;
        }
        System.out.println(answer%1234567891);
    }
}
