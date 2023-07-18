package solvedAC.class02;

/*
    백준 - 수 찾기
    https://www.acmicpc.net/problem/1920
 */


import java.io.*;
import java.util.*;

public class boj1920_수찾기_이진탐색풀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<M;i++){
            int result = binarySearch(arr, Integer.parseInt(st.nextToken()));
            if(result== -1) sb.append('0').append('\n');
            else sb.append('1').append('\n');
        }

        System.out.println(sb);

    }

    public static int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(key < arr[mid]){
                hi = mid - 1;
            }else if(key > arr[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
