import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문제
// 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
// 출력
// N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num > 1) {
            List<Integer> factors = primeFactorization(num);
            for (int factor : factors) {
                System.out.println(factor);
            }
        }
    }

    public static boolean[] sieve(int num) {
        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static List<Integer> primeFactorization(int num) {
        List<Integer> factors = new ArrayList<>();
        boolean[] isPrime = sieve(num);

        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                while (num % i == 0) {
                    factors.add(i);
                    num /= i;
                }
            }
        }

        return factors;
    }

}