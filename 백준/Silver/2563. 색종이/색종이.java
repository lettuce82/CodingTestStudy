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
		StringTokenizer st;
		int[][] arr = new int[100][100];

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			for (int j = a; j < a + 10; j++) {

				for (int k = b; k < b + 10; k++) {
					arr[k][j] = arr[k][j] + 1;
				}
			}
		}

		int count = 0;

		for (int[] ints : arr) {
			for (int anInt : ints) {
				if (anInt != 0) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
