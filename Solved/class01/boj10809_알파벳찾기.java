package solvedAC.class01;

import java.io.*;

/*
    백준 - 알파벳 찾기
    https://www.acmicpc.net/problem/10809
 */

public class boj10809_알파벳찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int curr;

        char[] alpha = br.readLine().toCharArray();

        for(int i=0;i<alpha.length;i++){
            curr = alpha[i]-97;
            if(arr[curr]==0) arr[curr] = i+1;
        }

        for(int i=0;i<26;i++){
            System.out.print(arr[i]-1+" ");
        }

    }
}
