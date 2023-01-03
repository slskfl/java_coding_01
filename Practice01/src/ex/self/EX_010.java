package ex.self;

import java.util.Scanner;

public class EX_010 {
	public static void main(String[] args) {
		// 010. 모든 순열 생성
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.nextLine());
		String result = new String();

	/*	for(int i=0; i<sb.length(); i++){
			result = "";
			for(int j=0; j<=i; j++){
				result += sb.charAt(j); 
			}
			System.out.println(result);
		}*/
		
		permute("", String.valueOf(sb));
	}
	
	private static void permute(String prtx, String str) {
		int n = str.length();
		
		if(n ==0) {
			System.out.println(prtx);
		}else {
			for(int i=0; i<n; i++) {
				permute(prtx + str.charAt(i), str.substring(i+1, n) + str.substring(0, i));
			}
		}
	}
}
