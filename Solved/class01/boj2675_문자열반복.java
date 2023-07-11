package solvedAC.class01;

import java.io.*;
import java.util.*;

/*
    백준 - 문자열 반복
    https://www.acmicpc.net/problem/2675
 */

public class boj2675_문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int R;

        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            R = Integer.parseInt(st.nextToken());
            char[] str = st.nextToken().toCharArray();

            for(int i=0;i<str.length;i++){
                for(int j=0;j<R;j++){
                    System.out.print(str[i]);
                }
            }
            System.out.println();
        }
    }
}
