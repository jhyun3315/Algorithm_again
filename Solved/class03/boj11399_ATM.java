
/*
    백준 - ATM
    https://www.acmicpc.net/problem/11399
 */

import java.io.*;
import java.util.*;

public class boj11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> lst = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
            lst.add(Integer.parseInt(st.nextToken()));

        Collections.sort(lst);
        int[] arr = new int[N];
        arr[0] = lst.get(0);
        int sum = arr[0];

        for (int i = 1; i < N; i++) {
            arr[i] = arr[i - 1] + lst.get(i);
            sum += arr[i];
        }

        System.out.println(sum);

    }
}
