import java.io.*;

/*
    백준 - 모든 순열
    https://www.acmicpc.net/problem/10974
 */
public class boj10974 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Permutation(new int[N], new boolean[N], N,0);

    }

    private static void Permutation(int[] sel, boolean[] visited, int n, int dept) {
        if(dept==n){
            for (int i=0;i<n;i++) System.out.print(sel[i]+" ");
            System.out.println();
            return;
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                sel[dept] = i+1;
                Permutation(sel,visited,n,dept+1);
                visited[i] = false;
            }

        }
    }
}
