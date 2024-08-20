import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

	출력
	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int width = 2 * n - 1;
		int center = 1;
		while (width + 2 > center) {

			for (int i = 0; i < (width - center) / 2; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i < center; i++) {
				System.out.print("*");
			}
			center += 2;
			System.out.println();
		}

		center -= 4;

		while (center >= 0) {

			for (int i = 0; i < (width - center) / 2; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i < center; i++) {
				System.out.print("*");
			}

			center -= 2;

			if (center >= 0) {
				System.out.println();
			}

		}

	}
}