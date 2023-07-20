package solvedAC.class02;

/*
    백준 - 프린터 큐
    https://www.acmicpc.net/problem/1966
 */

import java.io.*;
import java.util.*;

public class boj1966_프린터큐 {

    public static class Point {
        int num;
        int prior;

        Point(int num, int prior) {
            this.num = num;
            this.prior = prior;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int value;

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<Point> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine()," ");

            for(int i=0;i<N;i++){
                q.add(new Point(i, Integer.parseInt(st.nextToken())));
            }

            int count = 0;

            while(!q.isEmpty()){
                Point p = q.poll();
                boolean check = true;

                for(int s=0;s<q.size();s++){
                    if(p.prior < q.get(s).prior){
                        q.offer(p);
                        for(int i=0;i<s;i++){
                            q.offer(q.poll());
                        }

                        check = false;
                        break;
                    }
                }
                if(!check) continue;
                count++;
                if(p.num == M) break;
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
