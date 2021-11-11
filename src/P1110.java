import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int a = n;
		
		do {
			n =(((n%10)*10)+((n/10)+(n%10))%10);
			cnt++;
		} while (a != n);
		bw.write(cnt+"\n");
		
		br.close();
		bw.flush();
		bw.close();

	}
	

}