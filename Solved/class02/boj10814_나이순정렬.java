package solvedAC.class02;

/*
    백준 - 나이순 정렬
    https://www.acmicpc.net/problem/10814
 */

import java.io.*;
import java.util.*;

public class boj10814_나이순정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>(){
            public int compare(String[] s1, String[] s2){
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(String[] s : arr) sb.append(s[0]).append(' ').append(s[1]).append('\n');
        System.out.println(sb);
    }
}
