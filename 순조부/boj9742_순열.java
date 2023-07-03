import java.io.*;
import java.util.*;

/*
    https://www.acmicpc.net/problem/9742
 */

public class boj9742_순열 {
    static int num;
    static int m, r;
    static char[] arr;
    static boolean check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line ="";
        while((line = br.readLine()) != null){
            StringTokenizer st  = new StringTokenizer(line, " ");

            arr = st.nextToken().toCharArray();
            m = Integer.parseInt(st.nextToken());
            r = arr.length;
            check=false;
            num =0;

            permutation(new char[r], new boolean[r], 0);
            if(!check) System.out.println(new String(arr) + " "+ m+ " = No permutation");
        }
    }

    public static void permutation(char[] sel, boolean[] visited, int dept){
        if(dept==r){
            num+=1;
            if(num==m) {
                System.out.println(new String(arr) + " "+ m+ " = " + new String(sel));
                check = true;
                return;
            }
        }

        for(int i=0;i<r;i++){
            if(!visited[i]){
                visited[i]=true;
                sel[dept] = arr[i];
                permutation(sel,visited,dept+1);
                visited[i] = false;
            }
        }

    }
}
