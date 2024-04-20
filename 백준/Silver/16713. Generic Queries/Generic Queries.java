import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 수열의 길이 N과 쿼리 개수 Q 입력
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        // 수열 입력
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // 각 위치까지의 누적 XOR 결과를 저장할 배열
        int[] prefixXor = new int[N + 1];
        prefixXor[0] = 0;
        for (int i = 1; i <= N; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ arr[i - 1];
        }

        // 각 쿼리에 대해 XOR 결과 계산
        int xorResult = 0;
        for (int i = 0; i < Q; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            // 구간의 XOR 값을 미리 계산한 뒤 쿼리의 답에 추가
            xorResult ^= (prefixXor[end] ^ prefixXor[start - 1]);
        }

        // 최종 결과 출력
        System.out.println(xorResult);

        scanner.close();
    }
}
