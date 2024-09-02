import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
	문제
	10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
	10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
	A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

	출력
	첫째 줄에 10진법 수 N을 B진법으로 출력한다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long N = Long.parseLong(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		System.out.println(convertToBase(N, B));

	}
	public static String convertToBase(long N, int B) {
		if (N == 0) return "0";

		StringBuilder result = new StringBuilder();
		while (N > 0) {
			long remainder = N % B;
			if (remainder < 10) {
				result.insert(0, (char)('0' + remainder));
			} else {
				result.insert(0, (char)('A' + remainder - 10));
			}
			N /= B;
		}

		return result.toString();
	}

}
