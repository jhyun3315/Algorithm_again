
/*
 *  백준 - 기적의 매매법
 *  https://www.acmicpc.net/problem/20546
 */

import java.io.*;
import java.util.*;

public class boj20546_기적의매매법 {
    static int M;
    static int[] nums = new int[14];
    static int[][] lst = new int[2][2];
    static int[] sung = new int[14];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());
        // 준현
        lst[0][0] = M;
        lst[0][1] = 0;
        // 상현
        lst[1][0] = M;
        lst[1][1] = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int curr;

        for (int i = 0; i < 14; i++) {
            curr = Integer.parseInt(st.nextToken());
            nums[i] = curr;

            if (lst[0][0] >= curr) {
                lst[0][1] += lst[0][0] / curr;
                lst[0][0] = lst[0][0] % curr;
            }

            if (i >= 3) {
                int result = check(i);
                if (result == 3 && lst[1][1] > 0) { // 3일째 상승이면 판다
                    sell(i);
                } else if (result == -3) { // 3일째 하락이면 구입
                    lst[1][1] += lst[1][0] / curr;
                    sung[i] = lst[1][0] / curr;
                    lst[1][0] = lst[1][0] % curr;
                }
            }

        }

        int result = lst[0][0] + lst[0][1] * nums[13] - lst[1][0];
        if (result > 0)
            System.out.println("BNP");
        else if (result < 0)
            System.out.println("TIMING");
        else
            System.out.println("SAMESAME");

    }

    public static void sell(int idx) {
        int result = 0;

        for (int i = 0; i < idx; i++) {
            if (sung[i] > 0) {
                result += nums[i] * sung[i];
                sung[i] = 0;
            }
        }
        lst[1][0] += result;
        lst[1][1] = 0;
    }

    public static int check(int idx) {
        int gap = 0;
        int prior = nums[idx - 3];

        for (int i = idx - 2; i <= idx; i++) {
            // 상승이라면 +1, 하락이면 -1
            if (nums[i] - prior > 0)
                gap++;
            else if (nums[i] - prior < 0)
                gap--;
            prior = nums[i];
        }
        return gap;
    }
}
