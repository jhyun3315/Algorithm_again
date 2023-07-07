import java.io.IOException;
import java.util.Arrays;

public class 순열 {
    /*
    <순열>
    - 설명: 전체 n개의 배열에서 r개의 요소를 차례대로 뽑는 경우의 수. (nPr)
    - 방법: 재귀함수
 */

    public static void main(String[] args) throws IOException {
        // 원본배열
        int[] arr = {1, 3, 5};
        // 담을배열
        int[] sel = new int[2];
        
        recursive(arr, sel, new boolean[arr.length],0);
	}

	private static void recursive(int[] arr, int[] sel, boolean[] visited, int idx) {
		if (idx == sel.length) {
			System.out.println(Arrays.toString(sel));
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				sel[idx] = arr[i];
				recursive(arr, sel, visited, idx + 1);
				visited[i] = false;
			}
		}
	}


}

