import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 숫자 카드의 개수
        int[] cards = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards); // 숫자 카드 정렬

        int M = Integer.parseInt(br.readLine()); // 찾아야 할 숫자 카드의 개수
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(countCard(cards, target)).append(" ");
        }

        System.out.println(sb);
    }

    private static int countCard(int[] cards, int target) {
		int left = 0;
		int right = cards.length - 1;
		int count = 0;
	
		// 이분 탐색으로 target 값이 있는 첫 번째 인덱스 찾기
		while (left <= right) {
			int mid = (left + right) / 2;
			if (cards[mid] >= target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
	
		// target 값과 같은 첫 번째 인덱스
		int firstIdx = left;
	
		left = 0;
		right = cards.length - 1;
	
		// 이분 탐색으로 target 값이 있는 마지막 인덱스 찾기
		while (left <= right) {
			int mid = (left + right) / 2;
			if (cards[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
	
		// target 값과 같은 마지막 인덱스
		int lastIdx = right;
	
		// 개수 계산
		count = lastIdx - firstIdx + 1;
	
		return count;
	}
}