package ex.self;

import java.util.Scanner;

public class EX_024 {

	public static void main(String[] args) {
		// 024. 문자열 변환
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String rpc = scan.next();
		
		System.out.println("1 :" + str.replace(rpc, "000"));
		
		
	}

}
