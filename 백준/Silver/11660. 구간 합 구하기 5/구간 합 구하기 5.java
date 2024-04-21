import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        // N과 M을 입력받습니다.
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        // 수열을 입력받습니다.
        int[][] arr = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        // 각 행과 각 열에 대해 누적 합을 계산합니다.
        int[][] sumArr = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1] + arr[i][j];
            }
        }

        // 각 쿼리에 대해 구간 합을 계산하고 출력합니다.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(tokenizer.nextToken());
            int y1 = Integer.parseInt(tokenizer.nextToken());
            int x2 = Integer.parseInt(tokenizer.nextToken());
            int y2 = Integer.parseInt(tokenizer.nextToken());

            // 구간 합을 계산합니다.
            int intervalSum = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1];
            sb.append(intervalSum).append('\n');
        }
        System.out.print(sb.toString());
    }
}