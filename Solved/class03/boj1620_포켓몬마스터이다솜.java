package solved.class02;

/*
    백준 - 나는야 포켓몬 마스터 이다솜
    https://www.acmicpc.net/problem/1620
 */

import java.io.*;
import java.util.*;

public class boj1620_포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        // 포켓몬의 개수
        int N = Integer.parseInt(st.nextToken());
        // 문제의 개수
        int M = Integer.parseInt(st.nextToken());

        String[] pocket = new String[N+1];
        int[] quiz = new int[M];
        String curr = "";

        for(int i=1;i<=N;i++){
            curr = br.readLine();
            pocket[i] = curr;
            map.put(curr,i);
        }


        for(int i=0;i<M;i++){
            curr = br.readLine();
            if(isInteger(curr)){
                sb.append(pocket[Integer.parseInt(curr)]).append('\n');
            }else sb.append(map.get(curr)).append('\n');
        }

        System.out.println(sb);

    }

    public static boolean isInteger(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
