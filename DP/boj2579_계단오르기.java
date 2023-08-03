
/*
    백준 - 계단 오르기
    https://www.acmicpc.net/problem/2579
 */

import java.io.*;

public class boj2579_계단오르기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] stair = new int[301];
        int[] max = new int[301];

        for (int i = 1; i <= N; i++)
            stair[i] = Integer.parseInt(br.readLine());

        max[1] = stair[1];
        max[2] = stair[1] + stair[2];
        max[3] = Math.max(stair[1], stair[2]) + stair[3];

        for (int i = 4; i <= N; i++) {
            max[i] = Math.max(max[i - 3] + stair[i - 1], max[i - 2]) + stair[i];
        }

        System.out.println(max[N]);

    }

}
