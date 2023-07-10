package solvedAC.class01;

/*
    백준 - 알람시계
    https://www.acmicpc.net/problem/2884
 */

import java.io.*;
import java.util.StringTokenizer;

public class boj2884_알람시계 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int gap = minute - 45;
        if (gap < 0) {
            if(hour==0) hour = 24;
            System.out.println((hour - 1) + " " + (60 + gap));
        }else System.out.println(hour+" "+gap);
    }
}
