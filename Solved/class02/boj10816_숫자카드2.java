package solvedAC.class02;

/*
    백준 - 숫자 카드 2
    https://www.acmicpc.net/problem/10816
 */

import java.io.*;
import java.util.*;

public class boj10816_숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int curr;

        for(int i=0;i<N;i++){
            curr = Integer.parseInt(st.nextToken());
            map.put(curr, map.getOrDefault(curr,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<M;i++){
            curr = Integer.parseInt(st.nextToken());
            if(map.get(curr)==null) sb.append('0').append(' ');
            else sb.append(map.get(curr)).append(' ');
        }

        System.out.println(sb);

    }
}
