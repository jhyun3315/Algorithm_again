package solvedAC.class02;

import java.io.*;
import java.util.*;

public class boj2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int curr;

        for(int i=0;i<N;i++){
            curr = Integer.parseInt(br.readLine());
            lst.add(curr);
            sum+=curr;
            map.put(curr,map.getOrDefault(curr,0)+1);
            max = Math.max(max, curr);
            min = Math.min(min, curr);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(lst);
        sb.append((int)Math.round((double)sum/N)).append('\n');
        sb.append(lst.get(N/2)).append('\n');

        int count = 0;
        int value = 0;

        for(int i : map.keySet()){
            if(count < map.get(i)) {
                count = map.get(i);
            }
        }
        for(int i : map.keySet()){
            if(count == map.get(i)) {
                value = i;
                break;
            }
        }

        sb.append(value).append('\n');
        sb.append(max-min);
        System.out.println(sb);
    }
}
