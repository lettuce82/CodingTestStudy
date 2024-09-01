import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
	문제
	가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로,
	세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
	이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.

	출력
	첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());

		long result = 0;
		int power = 0;

		for (int i = N.length() - 1; i >= 0; i--) {
			char c = N.charAt(i);
			int digit;

			if (Character.isDigit(c)) {
				digit = c - '0';
			} else {
				digit = c - 'A' + 10;
			}

			result += digit * Math.pow(B, power);
			power++;
		}

		System.out.println(result);

	}

}
