import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
	단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

	출력
	각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
	만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
	단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		StringBuilder sb = new StringBuilder();

		for (int i = 97; i < 123; i++) {
			sb.append(word.indexOf(i)).append(" ");
		}

		System.out.println(sb);

	}
}