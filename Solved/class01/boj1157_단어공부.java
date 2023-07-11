package solvedAC.class01;

import java.io.*;

/*
    백준 - 단어 공부
    https://www.acmicpc.net/problem/1157
 */

public class boj1157_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toLowerCase().toCharArray();
        int[] alpha = new int[26];
        int curr;
        int maxIdx =0;
        int maxCount = 0;

        for(int i=0;i<arr.length;i++){
            curr = arr[i]-97;
            alpha[curr]+=1;
            if(alpha[curr] > maxCount){
                maxCount = alpha[curr];
                maxIdx = curr;
            }
        }

        // 중복일때 처리
        boolean check = false;
        for(int i=0;i<26;i++){
            if(alpha[i]==maxCount && maxIdx!=i) check=true;
        }

        if(check) System.out.println("?");
        else System.out.println((char) (maxIdx+65));

    }
}
