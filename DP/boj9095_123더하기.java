
/*
    백준 - 1,2,3 더하기
    https://www.acmicpc.net/problem/9095
 */

import java.io.*;

public class boj9095_123더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[12];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 4; i < 12; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append('\n');
        }

        System.out.println(sb);
    }
}
