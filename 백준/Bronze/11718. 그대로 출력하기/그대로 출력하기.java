import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
	문제
	입력 받은 대로 출력하는 프로그램을 작성하시오.

	출력
	입력받은 그대로 출력한다.
*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			System.out.println(line);
			
		}

		br.close();
	}
}