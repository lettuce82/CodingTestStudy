import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
	문제
	상근이는 친구들과 함께 SF영화를 찍으려고 한다. 이 영화는 외계 지형이 필요하다. 실제로 우주선을 타고 외계 행성에 가서 촬영을 할 수 없기 때문에, 컴퓨터 그래픽으로 CG처리를 하려고 한다.
	외계 지형은 중앙 이동 알고리즘을 이용해서 만들려고 한다.
	알고리즘을 시작하면서 상근이는 정사각형을 이루는 점 4개를 고른다. 그 후에는 다음과 같은 과정을 거쳐서 지형을 만든다.
	1. 정사각형의 각 변의 중앙에 점을 하나 추가한다.
	2. 정사각형의 중심에 점을 하나 추가한다.
	초기 상태에서 위와 같은 과정을 한 번 거치면 총 4개의 정사각형이 새로 생긴다. 이와 같은 과정을 상근이가 만족할 때 까지 계속한다.
	아래 그림은 과정을 총 2번 거쳤을 때까지의 모습이다.

	출력
	첫째 줄에 과정을 N번 거친 후 점의 수를 출력한다.

*/

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 0 - 4 - 2의 제곱
		// 1 - 9 - 3의 제곱 (1 증가 - 2의 0승 증가) - 2의 1승 + 1
		// 2 - 25 - 5의 제곱 (2 증가 - 2의 1승 증가) - 2의 2승 + 1
		// 3 - ? - 9의 제곱 (4 증가 - 2의 2승 증가) - 2의 3승 + 1
		// 4 - ? - 17의 제곱 (8 증가 - 2의 3승 증가)
		// 5 - ? 1089 - 33의 제곱 (16 증가 - 2의 4승 증가)


		long side = 1L << n;
		side += 1;

		System.out.println(side * side);

	}

}
