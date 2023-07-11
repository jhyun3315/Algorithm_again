package solvedAC.class01;

import java.io.*;

/*
    백준 - 나머지
    https://www.acmicpc.net/problem/3052
 */

public class boj3052_나머지 {
    public static void main(String[] args) throws IOException {
        int arr[] = new int[1000];
        int curr, result;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int t=0;t<10;t++){
            curr = Integer.parseInt(br.readLine());
            result = curr%42;
            if(arr[result]==0) {
                arr[result] = 1;
                count++;
            }
        }

        System.out.println(count);

    }
}
