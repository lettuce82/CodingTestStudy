import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int smallNum = Integer.parseInt(br.readLine());
        int bigNum = Integer.parseInt(br.readLine());

        boolean[] isPrime = sieveOfEratosthenes(smallNum, bigNum);

        int min = Integer.MAX_VALUE;
        int sum = 0;
        boolean foundPrime = false;

        for (int i = smallNum; i <= bigNum; i++) {
            if (isPrime[i - smallNum]) {
                if (i < min) {
                    min = i;
                }
                sum += i;
                foundPrime = true;
            }
        }

        if (foundPrime) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean[] sieveOfEratosthenes(int smallNum, int bigNum) {
        boolean[] prime = new boolean[bigNum - smallNum + 1];

        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        if (smallNum <= 1) {
            prime[0] = false;
            if (smallNum <= bigNum) {
                prime[1 - smallNum] = false;
            }
        }

        for (int p = 2; p * p <= bigNum; p++) {
            int start = Math.max(p * p, ((smallNum + p - 1) / p) * p) - smallNum;
            for (int i = start; i < prime.length; i += p) {
                prime[i] = false;
            }
        }

        return prime;
    }
}