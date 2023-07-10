package solvedAC.class01;

import java.io.*;
import java.util.Arrays;

/*
    백준 - 최대값
    https://www.acmicpc.net/status?from_problem=1&problem_id=2562
 */

public class boj2562_최대값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100];
        int[] sort = new int[9];

        for(int i=1;i<10;i++){
            int num = Integer.parseInt(br.readLine());
            sort[i-1]= num;
            arr[num] = i;
        }

        Arrays.sort(sort);
        int max = sort[8];
        System.out.println(max);
        System.out.println(arr[max]);

    }
}
