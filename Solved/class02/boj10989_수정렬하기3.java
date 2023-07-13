package solvedAC.class02;

/*
    백준 - 수 정렬하기3
    https://www.acmicpc.net/problem/10989
 */

import java.io.*;
import java.util.*;

public class boj10989_수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for(int i : arr) sb.append(i).append('\n');

        System.out.println(sb);
    }
}
