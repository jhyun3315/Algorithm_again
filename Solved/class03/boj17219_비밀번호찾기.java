package solvedAC.class03;


import java.io.*;
import java.util.*;

public class boj17219_비밀번호찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            String site = st.nextToken();
            if(!map.containsKey(site)) map.put(site, st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){
            String str = br.readLine();
            sb.append(map.get(str)).append('\n');
        }

        System.out.println(sb);

    }
}
