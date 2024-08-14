import java.io.IOException;
import java.util.Scanner;
/*
	문제
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

public class Main {

    public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + b);
	}
}