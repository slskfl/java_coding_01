package ex.self;

import java.util.Scanner;

public class EX_021 {

	public static void main(String[] args) {
		// 021. 문자열 앞과 뒤 공백 제거
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.nextLine());
		
		System.out.println(String.valueOf(sb).trim());
	}
}
