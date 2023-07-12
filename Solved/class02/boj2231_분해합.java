package solvedAC.class02;

/*
    백준 - 분해합
    https://www.acmicpc.net/problem/2231
 */


import java.io.*;

public class boj2231_분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer =0;

        for(int i=0;i<N;i++){
            int sum =0;
            int num = i;

            // 자리수 합 구하기
            while(num!=0){
                sum += num%10;
                num /= 10;
            }

            if(sum+i == N){
                answer = i;
                break;
            }
        }

        System.out.println(answer);

    }
}
