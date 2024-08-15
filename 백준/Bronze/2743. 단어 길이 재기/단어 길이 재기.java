import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

	출력
	첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.

*/

public class Main {

	public static void main(String[] args) throws IOException {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String word = br.readLine();
			System.out.println(word.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}