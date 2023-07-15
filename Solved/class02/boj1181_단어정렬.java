package solvedAC.class02;

/*
    백준 - 단어 정렬
    https://www.acmicpc.net/problem/1181
 */

import java.io.*;
import java.util.*;

public class boj1181_단어정렬 {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(br.readLine());
         HashSet<String> set = new HashSet<>();

         for(int i=0;i<N;i++) set.add(br.readLine());

         String[] arr = set.toArray(new String[0]);

         Arrays.sort(arr, new Comparator<String>(){
             public int compare(String s1, String s2){
                 if(s1.length() == s2.length()) return s1.compareTo(s2);
                 else return s1.length()-s2.length();
             }
        });

         for(String s : arr) System.out.println(s);
    }
}
