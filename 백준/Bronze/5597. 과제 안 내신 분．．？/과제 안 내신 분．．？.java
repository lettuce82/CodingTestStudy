import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
	교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

	출력
	출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.

*/

public class Main {

    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] attended = new boolean[31];

		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			attended[num] = true;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 30; i++) {
			if (!attended[i]) {
				sb.append(i).append('\n');
			}
		}

		System.out.println(sb);
	}

}