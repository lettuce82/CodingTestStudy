import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
/*
	문제
	어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
	예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
	n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

	출력
	테스트케이스 마다 한줄에 하나씩 출력해야 한다.
	n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
	이때, 약수들은 오름차순으로 나열해야 한다.
	n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String input = br.readLine();
			int n = Integer.parseInt(input);

			if (n == -1) {
				break;
			}

			// 약수 구하기
			ArrayList<Integer> divisors = new ArrayList<>();
			for (int i = 1; i <= Math.sqrt(n); i++) {

				if (n % i == 0) {
					divisors.add(i);

					if (i != n / i) {
						divisors.add(n / i);
					}
				}
			}

			Collections.sort(divisors);

			//완전수인지 확인
			int sum = 0;
			for (Integer divisor : divisors) {
				if (divisor != n) {
					sum += divisor;
				}
			}

			//그에 따른 출력값
			if (sum == n) {
				System.out.print(n + " = ");
				for (int i = 0; i < divisors.size() - 1; i++) {
					System.out.print(divisors.get(i));
					if (i != divisors.size() - 2) {
						System.out.print(" + ");
					}
				}
				System.out.println();
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}

	}

}
