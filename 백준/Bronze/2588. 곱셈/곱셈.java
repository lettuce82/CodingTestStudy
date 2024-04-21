import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());

		int b_100 = b / 100;
		int b_10 = b % (b_100 * 100) / 10;
		int b_1 = b % (b_10 * 100) % 10;

		int num3 = a * b_1;
		int num4 = a * b_10;
		int num5 = a * b_100;

		int num6 = num3 + num4*10 + num5*100;

		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
    }
}