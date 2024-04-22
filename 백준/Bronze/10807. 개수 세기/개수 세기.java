import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(line);

        int[] num = new int[n];
        int answer = 0;

        // Read array elements
        line = reader.readLine();
        tokenizer = new StringTokenizer(line);
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(tokenizer.nextToken());
        }

        // Read target value
        line = reader.readLine();
        int v = Integer.parseInt(line);

        // Count occurrences of v in the array
        for (int i : num) {
            if (i == v) {
                answer++;
            }
        }
        System.out.println(answer);
        reader.close(); // Close the reader when done
    }
}
