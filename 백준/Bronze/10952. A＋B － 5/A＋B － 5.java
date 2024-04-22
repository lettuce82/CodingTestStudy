import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		List<Integer> sum = new ArrayList<>();
		int num1;
		int num2;

		while (true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 == 0 && num2 == 0) {
				break;
			} else {
				sum.add(num1 + num2);
			}
		}

		for (Integer integer : sum) {
			System.out.println(integer);	
		}
    }
}