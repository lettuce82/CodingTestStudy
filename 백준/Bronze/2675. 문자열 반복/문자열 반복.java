import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
	문제
	문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
	즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
	S에는 QR Code "alphanumeric" 문자만 들어있다.
	QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

	출력
	각 테스트 케이스에 대해 P를 출력한다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int repeat = Integer.parseInt(input[0]);
			char[] word = input[1].toCharArray();

			for (char c : word) {
				for (int j = 0; j < repeat; j++) {
					sb.append(c);
				}
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}