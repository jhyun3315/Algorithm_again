package solvedAC.class01;

import java.io.*;
import java.util.StringTokenizer;

/*
    백준 - ACM 호텔
    https://www.acmicpc.net/problem/10250
 */

public class boj10250_ACM호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int H,W,N, nh, nw;

        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            if(N%H == 0) {
                nh = H;
                nw = N/H;
            }
            else {
                nh = N%H;
                nw = N/H+1;
            }

            System.out.println(100*nh+nw);

        }
    }
}
