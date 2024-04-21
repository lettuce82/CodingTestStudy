import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static int[] solution(int N, int M, int[][] arr, int[][] queryArr) {
        // 각 행의 누적 합을 계산하여 2차원 배열 sumArr을 만듭니다.
        int[][] sumArr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == 0) {
                    sumArr[i][j] = arr[i][j];
                } else {
                    sumArr[i][j] = sumArr[i][j - 1] + arr[i][j];
                }
            }
        }

        // 각 쿼리에 대해 구간 합을 계산하고, 그 결과를 배열 answer에 저장합니다.
        int[] answer = new int[M];
        for (int i = 0; i < M; i++) {
            int x1 = queryArr[i][0] - 1; // 인덱스는 0부터 시작하므로 1을 빼줍니다.
            int y1 = queryArr[i][1] - 1;
            int x2 = queryArr[i][2] - 1;
            int y2 = queryArr[i][3] - 1;

            // 구간 합을 계산합니다.
            int intervalSum = 0;
            for (int j = x1; j <= x2; j++) {
                intervalSum += sumArr[j][y2] - (y1 > 0 ? sumArr[j][y1 - 1] : 0);
            }
            answer[i] = intervalSum;
        }
        return answer;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] NM = reader.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] arrs = reader.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(arrs[j]);
                }
            }
            
            int[][] queryArr = new int[M][4];
            for (int i = 0; i < M; i++) {
                String[] arrs = reader.readLine().split(" ");
                for (int j = 0; j < 4; j++) {
                    queryArr[i][j] = Integer.parseInt(arrs[j]);
                }
            }
            int[] answer = solution(N, M, arr, queryArr);

            for (int i : answer) {
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}