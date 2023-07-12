package solvedAC.class02;

/*
    백준 - 직각삼각형
    https://www.acmicpc.net/problem/4153
 */

import java.io.*;
import java.util.*;

public class boj4154_직각삼각형 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A,B,C;
        String line ="";
        int[] arr = new int[3];

        while(!(line = br.readLine()).equals("0 0 0")){
            StringTokenizer st = new StringTokenizer(line," ");
            for(int i=0;i<3;i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            A = arr[2];
            B = arr[1];
            C = arr[0];

            if( (A*A) == (B*B)+(C*C) ) System.out.println("right");
            else System.out.println("wrong");


        }
    }
}
