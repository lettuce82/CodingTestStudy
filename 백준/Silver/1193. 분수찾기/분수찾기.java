import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
	문제
	이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
	X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

	출력
	첫째 줄에 분수를 출력한다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());

		int crossCount = 1;
		int prevCountSum = 0;

		while (true) {
			if (X <= prevCountSum + crossCount) {
				if (crossCount % 2 == 1) {  // 홀수 번째 대각선
					System.out.println((crossCount - (X - prevCountSum - 1)) + "/" + (X - prevCountSum));
				} else {  // 짝수 번째 대각선
					System.out.println((X - prevCountSum) + "/" + (crossCount - (X - prevCountSum - 1)));
				}
				break;
			} else {
				prevCountSum += crossCount;
				crossCount++;
			}
		}

	}

}
