import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

	출력
	첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

*/

public class Main {

    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
		int[] count = new int[26];
		for (int i = 0; i < word.length(); i++) {
			count[word.charAt(i) - 'A']++;
		}

		int maxCount = 0;
		char maxChar = '?';

		for (int i = 0; i < count.length; i++) {

			if (count[i] > maxCount) {
				maxCount = count[i];
				maxChar = (char) (i + 'A');
			} else if (count[i] == maxCount) {
				maxChar = '?';
			}
		}
		System.out.println(maxChar);
	}

}