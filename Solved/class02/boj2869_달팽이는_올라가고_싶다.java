package solvedAC.class02;

/*
    백준 - 달팽이는 올라가고 싶다
    https://www.acmicpc.net/problem/2869
 */

import java.io.*;
import java.util.*;

public class boj2869_달팽이는_올라가고_싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int answer = (V-B)/(A-B);
        if( (V-B) % (A-B) !=0){
            answer++;
        }
        System.out.println(answer);

    }
}
