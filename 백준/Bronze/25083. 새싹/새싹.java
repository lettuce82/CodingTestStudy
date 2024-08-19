import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	아래 예제와 같이 새싹을 출력하시오.

	출력
	새싹을 출력한다.
*/

public class Main {
	public static void main(String[] args) throws IOException {
		//가로 14
		//세로 6
		String sprout = "         ,r'\"7\n" +
						"r`-_   ,'  ,/\n" +
						" \\. \". L_r'\n" +
						"   `~\\/\n" +
						"      |\n" +
						"      |";

		System.out.println(sprout);
	}
}