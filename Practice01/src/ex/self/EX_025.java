package ex.self;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EX_025 {

	public static void main(String[] args) {
		// 025. 두 수의 최솟값과 최댓값 계산
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			
			System.out.println(n1>n2? n1 : n2 );
			
		//	bw.write((int) (n1>n2? n1 : n2 + "\n"));
		//	bw.flush();
		//	bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
