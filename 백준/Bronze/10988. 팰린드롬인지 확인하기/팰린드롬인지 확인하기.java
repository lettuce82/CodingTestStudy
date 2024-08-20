import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
	팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
	level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

	출력
	첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		System.out.println(reverseWords(word) ? 1 : 0);
    }

	public static boolean reverseWords(String word) {
		int left = 0;
		int right = word.length() - 1;
		while (left <= right) {
			if (word.charAt(left) != word.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}