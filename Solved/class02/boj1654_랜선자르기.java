package solved.class02;

/*
    백준 - 랜선 자르기
    https://www.acmicpc.net/problem/1654
 */

import java.io.*;
import java.util.*;

public class boj1654_랜선자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long min = 0;
        long max = 0;
        int curr;

        for(int i=0;i<K;i++) {
            curr = Integer.parseInt(br.readLine());
            arr[i] = curr;
            max = Math.max(max, curr);
        }
        max +=1;

        while(min<max){
            long mid = (min+max)/2;
            long count =0;

            for(int i: arr){
                count+= (i/mid);
            }

            if(count < N) max = mid;
            else min = mid+1;
        }

        System.out.println(min-1);

    }
}
