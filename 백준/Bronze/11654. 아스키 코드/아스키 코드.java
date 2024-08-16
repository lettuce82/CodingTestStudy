import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

	출력
	입력으로 주어진 글자의 아스키 코드 값을 출력한다.

*/

public class Main {

	public static void main(String[] args) throws IOException {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int c = br.read();
			System.out.println(c);
			System.out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}