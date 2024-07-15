import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		// 입력 받기
		String[] input = scanner.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);

		// 요세푸스 순열 계산
		List<Integer> result = josephus(n, k);

		// 결과 출력
		System.out.println(result.toString().replace("[", "<").replace("]", ">"));

		scanner.close();
	}
	public static List<Integer> josephus(int n, int k) {
		LinkedList<Integer> circle = new LinkedList<>();
		List<Integer> result = new ArrayList<>();

		// 1부터 n까지의 숫자를 원형 리스트에 추가
		for (int i = 1; i <= n; i++) {
			circle.add(i);
		}

		int index = 0;

		while (!circle.isEmpty()) {
			// k-1만큼 이동 (0부터 시작하므로 k-1)
			index = (index + k - 1) % circle.size();

			// 현재 위치의 사람을 제거하고 결과에 추가
			result.add(circle.remove(index));
		}

		return result;
	}
}