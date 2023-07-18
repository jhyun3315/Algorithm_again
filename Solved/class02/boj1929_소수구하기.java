package solvedAC.class02;

import java.io.*;
import java.util.*;

public class boj1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        arr[0] = 1;
        arr[1] = 1;

        StringBuilder sb = new StringBuilder();

        for(int i=2;(i*i)<=N;i++){
            if(arr[i]==0){
                for(int j=i*i;j<=N;j+=i) arr[j] = 1;
            }
        }

        for(int i=M;i<=N;i++) if(arr[i]==0) sb.append(i).append('\n');
        System.out.println(sb);
    }
}
