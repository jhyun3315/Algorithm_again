package solvedAC.class02;

/*
    백준 - 평균
    https://www.acmicpc.net/problem/1546
 */


import java.io.*;
import java.util.*;

public class boj1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        double[] arr = new double[N];
        double max = 0;
        double curr;
        double sum =0;

        for(int i=0;i<N;i++){
            curr = Double.parseDouble(st.nextToken());
            arr[i] = curr;
            max = Math.max(max, curr);
        }

        for(double l : arr){
            sum+= (l/max)*100;
        }
        System.out.println(sum/N);

    }
}
