package solved.class02;

/*
    백준 - 동전 0
    https://www.acmicpc.net/problem/11047
 */

import java.io.*;
import java.util.StringTokenizer;

public class boj11047_동전0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        for(int i=0;i<N;i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int cost = K;
        int curr;

        for(int i=N-1;i>=0;i--){
            if(cost ==0) break;
            curr = coin[i];
            if( cost >0 && curr <= cost) {
                int mod = cost/curr;
                cost -= curr*mod;
                count+=mod;
            }
        }
        System.out.println(count);
    }
}
