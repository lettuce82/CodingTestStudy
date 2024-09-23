import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 입력받은 수 중 최대값을 찾습니다.
        int maxNum = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            maxNum = Math.max(maxNum, numbers[i]);
        }
        
        // 에라토스테네스의 체를 이용해 소수 배열을 만듭니다.
        boolean[] isPrime = sieveOfEratosthenes(maxNum);
        
        // 소수의 개수를 셉니다.
        int count = 0;
        for (int num : numbers) {
            if (num >= 2 && isPrime[num]) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        
        // 초기에 모든 수를 소수로 체크
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        
        // 에라토스테네스의 체 알고리즘
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        
        return prime;
    }
}