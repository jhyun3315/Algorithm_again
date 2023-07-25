package solved.class02;

/*
    백준 - 듣보잡
    https://www.acmicpc.net/problem/1764
 */

import java.io.*;
import java.util.*;

public class boj1764_듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            map.put(br.readLine(),1);
        }

        String curr = "";
        ArrayList<String> lst = new ArrayList<>();

        int count = 0;
        for(int i=0;i<M;i++){
            curr = br.readLine();
            if(map.containsKey(curr)){
                count++;
                lst.add(curr);
            }
        }
        Collections.sort(lst);
        for(String str : lst) {
            sb.append(str).append('\n');
        }

        System.out.println(count);
        System.out.println(sb);


    }
}
