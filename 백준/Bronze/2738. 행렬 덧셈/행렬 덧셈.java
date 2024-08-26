import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
	문제
	N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

	출력
	첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {

				list.get(i).add(Integer.parseInt(st.nextToken()));
			}

		}

		for (int i = 0; i < n; i++) {

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {

				list.get(i).set(j, list.get(i).get(j) + Integer.parseInt(st.nextToken()));
			}

		}

		StringBuilder sb = new StringBuilder();
		for (ArrayList<Integer> row : list) {
			for (int val : row) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
		}


		System.out.println(sb);
	}

}
