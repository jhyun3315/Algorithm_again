package solvedAC.class01;

import java.io.*;

/*
    백준 - 숫자의 개수
    https://www.acmicpc.net/problem/2577
 */

public class boj2577_숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 1;
        int[] arr = new int[10];

        for(int i=0;i<3;i++){
            total*= Integer.parseInt(br.readLine());
        }

        char[] numToString = String.valueOf(total).toCharArray();
        int curr;
        int length = numToString.length;

        for(int i=0;i<length;i++){
            curr = Integer.parseInt(String.valueOf(numToString[i]));
            arr[curr] +=1;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
