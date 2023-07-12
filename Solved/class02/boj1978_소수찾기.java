package solvedAC.class02;
/*
    백준 - 소수찾기
    https://www.acmicpc.net/problem/1978
 */

import java.io.*;
import java.util.*;

public class boj1978_소수찾기 {
    static int answer;
    static boolean[] sosu;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sosu = new boolean[1001];
        answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0;i<N;i++){
            getValue(Integer.parseInt(st.nextToken()));
        }

        System.out.println(answer);
    }

    // 소수 구하기
    // 소수: 1과 자기 자신만 약수로 가짐.
    private static void getValue(int num) {
        // 주어진 수가 1이거나 소수로 판결이 이미 났으면 카운트 하고 리턴.
        if(num==1) return;
        if(sosu[num]){
            answer++;
            return;
        }

        boolean check = true;

        for(int i=2;i<num;i++){
            // 나누어 떨어지면 안됨!
            if(num%i ==0) {
                check = false;
                return;
            }
        }
        answer++;
    }
}
