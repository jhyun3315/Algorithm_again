package solvedAC.class01;

import java.io.*;
import java.util.*;


/*
    백준 - 단어의 개수
    https://www.acmicpc.net/problem/1152
 */

public class boj1152_단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        System.out.println(st.countTokens());
    }
}
