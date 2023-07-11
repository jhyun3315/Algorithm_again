package solvedAC.class01;

import java.io.*;

/*
    백준 - 음계
    https://www.acmicpc.net/problem/2920
 */

public class boj2920_음계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.equals("1 2 3 4 5 6 7 8")){
            System.out.println("ascending");
        }else if(str.equals("8 7 6 5 4 3 2 1")) System.out.println("descending");
        else System.out.println("mixed");

    }
}
