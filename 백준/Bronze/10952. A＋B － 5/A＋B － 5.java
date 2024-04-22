import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String line = reader.readLine();
            if (line == null || line.equals("0 0")) {
                break;
            }
            
            StringTokenizer tokenizer = new StringTokenizer(line);
            int num1 = Integer.parseInt(tokenizer.nextToken());
            int num2 = Integer.parseInt(tokenizer.nextToken());
            
            System.out.println(num1 + num2);
        }
        
        reader.close(); // 스트림을 사용한 후에는 반드시 닫아주어야 합니다.
    }
}
