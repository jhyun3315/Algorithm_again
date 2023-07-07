import java.io.IOException;
import java.util.*;

public class combination2 {
    public static void main(String[] args) throws IOException {
        /*
        arr : 뽑을 숫자가 들어있는 배열 
        r : arr 배열의 요소 중에서 뽑을 개수
         */
        int[] arr = {1,2,3,4,5};
        int r = 2;

        combination(arr,new int[r], r,0,0);

    }

    /*
    start : 시작 인덱스
    dept : 현재 선택한 개수
     */
    public static void combination(int[] arr, int[] sel, int r, int start, int dept){
        if(dept == r){
            System.out.println(Arrays.toString(sel));
            return;
        }
        for(int i=start;i<arr.length;i++){
            sel[dept] = arr[i];
            combination(arr,sel,r,i+1,dept+1);
        }
    }
}
