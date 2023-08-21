package 알고리즘_공부.solvedAC.class03;

/*
    백준 - 잃어버린 괄호
    https://www.acmicpc.net/problem/1541
 */

import java.io.*;

public class boj1541_잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("-");
        int sum =0;

        for(int i=0;i<str.length;i++){
            int tmp =0;

            String[] nums = str[i].split("\\+");
            for(int j=0;j<nums.length;j++){
                tmp+= Integer.parseInt(nums[j]);
            }

            if(i==0) sum +=tmp;
            else sum-=tmp;

        }

        System.out.println(sum);
    }
}
