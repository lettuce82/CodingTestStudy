import java.util.Scanner;

public class Main {
    public static int solution(int N, int S, int[] arr) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int answer = Integer.MAX_VALUE;

        while (right <= N) {
            if (sum < S) {
                if (right < N) {
                    sum += arr[right];
                }
                right++;
            } else if (sum >= S) {
                answer = Math.min(answer, right - left);
                sum -= arr[left];
                left++;
            }
        }
        
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 수열의 길이 N과 합 S를 입력 받음
        int N = sc.nextInt();
        int S = sc.nextInt();
        
        // 수열을 입력 받음
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(solution(N, S, arr));
        
        sc.close();
	}
}