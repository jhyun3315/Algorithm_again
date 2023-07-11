package solvedAC.class01;

import java.io.*;

/*
    백준 - OX 퀴즈
    https://www.acmicpc.net/problem/8958
 */

public class boj8958_OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int len, score, total;
        boolean check = false;

        for(int t=0;t<T;t++){
            char[] arr = br.readLine().toCharArray();
            len = arr.length;
            score = 0;
            total = 0;

            for(int i=0;i<len;i++){
                if(arr[i]=='O' && !check){
                    check = true;
                    score = 1;
                    total +=1;
                }else if(arr[i]=='O' && check){
                    score+=1;
                    total+=score;
                }else{
                    check = false;
                    score =0;
                }
            }
            System.out.println(total);
        }
    }
}
