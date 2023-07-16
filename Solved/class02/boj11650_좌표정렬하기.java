package solvedAC.class02;

/*
    백준 - 좌표 정렬하기
    https://www.acmicpc.net/problem/11650
 */

import java.io.*;
import java.util.*;

public class boj11650_좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] i1, int[] i2){
                if(i1[0] == i2[0]) return i1[1] -i2[1];
                else return i1[0] - i2[0];
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int[] i : arr) sb.append(i[0]).append(' ').append(i[1]).append('\n');
        System.out.println(sb);

    }
}
