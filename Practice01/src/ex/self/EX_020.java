package ex.self;

import java.util.Scanner;

public class EX_020 {

	public static void main(String[] args) {
		// 같은 문자열 n번 이어 붙이기
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		int n = scan.nextInt();
		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<n; i++){
			result.append(sb);
		}

		System.out.println(result);
	}

}
