package solved.class02;

/*
    백준 - 통계학
    https://www.acmicpc.net/problem/2108
 */

import java.io.*;
import java.util.*;

public class boj2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> lst = new ArrayList<>();
        int[] arr = new int[8001];

        int sum =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int curr;
        int count = Integer.MIN_VALUE;

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            curr = Integer.parseInt(br.readLine());
            lst.add(curr);
            arr[4000+curr] += 1;
            max = Math.max(max, curr);
            min = Math.min(min, curr);
            count = Math.max(count, arr[4000+curr]);
            sum+=curr;
        }

        // 산술평균
        sb.append(Math.round((double)sum/N)).append('\n');

        Collections.sort(lst);
        // 중앙값
        sb.append(lst.get(N/2)).append('\n');

        int value=0;

        //최빈값
        if(N==1) value = lst.get(0);
        else{
            boolean check = false;

            for(int i=4000+min;i<=4000+max;i++){

                if(arr[i] == count){
                    value = i-4000;
                    if(check) {
                        break;
                    }else check = true;
                }
            }
        }

        sb.append(value).append('\n');

        // 범위
        sb.append(max-min);
        System.out.println(sb);


    }
}
