package ex.self;

import java.util.Scanner;

public class EX_009 {

	public static void main(String[] args) {
		// 009. 구분자로 여러 문자열 합치기
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] str = new String[n];
		
		for(int i=0; i<str.length; i++){
			str[i] =scan.next();
		}
		
		String fg = scan.next();
		StringBuffer result = new StringBuffer();
		for(int i=0; i<str.length; i++){
			result.append(str[i] + fg);
		}
		System.out.println(str[1]);
		System.out.println(result);
	}

}
