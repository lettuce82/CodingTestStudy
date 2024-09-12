import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
	문제
	어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다.
	6을 예로 들면
	6 ÷ 1 = 6 … 0
	6 ÷ 2 = 3 … 0
	6 ÷ 3 = 2 … 0
	6 ÷ 4 = 1 … 2
	6 ÷ 5 = 1 … 1
	6 ÷ 6 = 1 … 0
	그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
	두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.

	출력
	첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int count = 0;

		// i = 약수가 될 수
		// count = 약수의 개수 (순서)
		// n = 나눠질 수
		// m = 몇 번째 약수를 구해야하는지

		for (int i = 1; i <= n; i++) {

			// i가 n의 약수라면
			if (n % i == 0) {
				//약수의 개수는 올리고
				count++;

				// 만약 구해야 하는 약수의 갯수와 현재 약수의 순서와 같다면 해당 약수를 출력
				if (count == m) {
					System.out.println(i);
				}
			}
		}

		// 만약 약수의 개수가 구해야 하는 약수의 갯수보다 적다면 0을 출력
		if (m > count) {
			System.out.println(0);
		}

	}

}
