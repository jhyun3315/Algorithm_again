package solvedAC.class02;

/*
    백준 - 팰린드롬수
    https://www.acmicpc.net/problem/1259
 */

import java.io.*;
import java.util.*;


public class boj1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        int len;

        while(!(line = br.readLine()).equals("0")){
            char[] arr = line.toCharArray();
            len = arr.length;

            boolean check = true;

            for(int i=0;i<len;i++){
                if(arr[i] != arr[len-i-1]) {
                    check = false;
                    System.out.println("no");
                    break;
                }
            }

            if(check) System.out.println("yes");
        }

    }
}
