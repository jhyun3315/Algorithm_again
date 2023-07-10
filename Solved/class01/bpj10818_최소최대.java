package solvedAC.class01;

import java.io.*;
import java.util.*;

/*
    백준 - 최소, 최대
    https://www.acmicpc.net/problem/10818
 */

public class bpj10818_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int curr =0;

        for(int i=0;i<N;i++){
            curr = Integer.parseInt(st.nextToken());
            max = Math.max(max,curr);
            min = Math.min(min, curr);
        }

        System.out.println(min+" "+max);

    }
}
