import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2441 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		new Q_2441().start(br);
	}
	
	void start(BufferedReader br) throws Exception {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int numN = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= numN; i++) {
			for (int j = 1; j < i ; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= numN; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
