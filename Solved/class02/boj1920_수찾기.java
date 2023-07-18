package solvedAC.class02;

/*
    백준 - 수 찾기
    https://www.acmicpc.net/problem/1920
 */


import java.io.*;
import java.util.*;

public class boj1920_수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st  = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++) {
            map.put(Integer.parseInt(st.nextToken()),0);
        }

        int M = Integer.parseInt(br.readLine());
        st  = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<M;i++) {
            int curr = Integer.parseInt(st.nextToken());
            if(map.get(curr) != null) System.out.println(1);
            else System.out.println(0);
        }
    }
}
