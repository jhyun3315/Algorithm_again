import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[][] arr = new int[N][2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int curr;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            curr = Integer.parseInt(br.readLine());

            arr[i][0] = curr;
            sum += curr;
            map.put(curr, map.getOrDefault(curr, 0)+1);
            max = Math.max(max, curr);
            min = Math.min(min, curr);
        }

        // 산술평균
        sb.append((int) Math.round((double) sum / N)).append('\n');

        int count = 0;

        // 퇴빈값 구하기
        for(int key : map.keySet()){
            curr =  map.get(key);
            if(count < curr) count = curr;
        }

        ArrayList<Integer> lst = new ArrayList<>();

        for(int i=0;i<N;i++){
            curr = arr[i][0];
            arr[i][1] = map.get(curr);

            if( !lst.contains(curr) && arr[i][1] == count) {
                lst.add(curr);
            }
        }

        int value = 0;
        if(lst.size() == 1) value = lst.get(0);
        else {
            Collections.sort(lst);
            value = lst.get(1);
        }

        Arrays.sort(arr,new Comparator<int[] >(){
            @Override
            public int compare(int[] i1, int[] i2){
                return i1[0] -i2[0];
            }
        });

        // 중앙값
        sb.append(arr[N / 2][0]).append('\n');

        // 최빈값
        sb.append(value).append('\n');

        // 범위
        sb.append(max - min);

        // 최종출력
        System.out.println(sb);
    }
}
