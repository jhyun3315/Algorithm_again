package solvedAC.class01;

import java.io.*;

/*
    백준 - 별찍기2
    https://www.acmicpc.net/problem/2439
 */

public class boj2439_별찍기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
