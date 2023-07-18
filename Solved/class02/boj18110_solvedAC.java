package solvedAC.class02;

/*
    백준 - solved.ac
    https://www.acmicpc.net/problem/18110
 */

import java.io.*;
import java.util.*;

public class boj18110_solvedAC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> lst = new ArrayList<>();

        int sum =0;
        int curr;

        for(int i=0;i<N;i++){
            curr = Integer.parseInt(br.readLine());
            lst.add(curr);
            sum += curr;
        }
        Collections.sort(lst);

        int expt = (int) Math.round(N*0.15);

        for(int i=0;i<expt;i++){
            sum-=lst.get(i);
            sum-=lst.get(N-i-1);
        }

        System.out.println( (int) Math.round(sum/(N-(expt*2)*1.0)));

    }
}
