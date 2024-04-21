import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        int[][] testcase = new int[caseNum][2];
        int[] sum = new int[caseNum];

        for (int i = 0; i < caseNum; i++) {
            String[] ints = sc.nextLine().split(" ");
            for (int j = 0; j < 2; j++) {
                testcase[i][j] = Integer.parseInt(ints[j]);
            }
        }

        for (int i = 0; i < caseNum; i++) {
            sum[i] = testcase[i][0] + testcase[i][1];
        }

        for (int i = 0; i < caseNum; i++) {
            System.out.println("Case #" + (i + 1) + ": " + testcase[i][0] + " + " + testcase[i][1] + " = " + sum[i]);
        }
    }
}
