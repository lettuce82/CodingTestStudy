import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

	출력
	입력으로 주어진 숫자 N개의 합을 출력한다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		String numbers = br.readLine();

		int sum = 0;
		for (int i = 0; i < numbers.length(); i++) {
			sum += numbers.charAt(i) - '0';
		}

		System.out.println(sum);
	}
}