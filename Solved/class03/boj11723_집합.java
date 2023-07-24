package solved.class02;

/*
    백준 - 집합
    https://www.acmicpc.net/problem/11723
 */

import java.io.*;
import java.util.*;

public class boj11723_집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){
            String str = br.readLine();
            if(str.contains(" ")){
                StringTokenizer st = new StringTokenizer(str, " ");
                String curr = st.nextToken();
                int K = Integer.parseInt(st.nextToken());

                if(curr.equals("add")) set.add(K);
                else if(curr.equals("check")) {
                    if (set.contains(K)) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                }
                else if(curr.equals("remove") && set.contains(K)) set.remove(K);
                else if(curr.equals("toggle")){
                    if(set.contains(K)) set.remove(K);
                    else set.add(K);
                }
            }else{
                if(str.equals("all")){
                    set.clear();
                    for(int s=1;s<=20;s++) set.add(s);
                }else set.clear();
            }
        }
        System.out.println(sb);
    }
}
