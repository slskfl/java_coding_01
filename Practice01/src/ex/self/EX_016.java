package ex.self;

import java.util.Scanner;

public class EX_016 {

	public static void main(String[] args) {
		// 016. 문자열이 부분 문자열을 포함하는지 검사 
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.nextLine());
		StringBuffer ctsb = new StringBuffer(scan.nextLine());
		
		if(String.valueOf(sb).contains(ctsb)){
			System.out.println("포함합니다.");
		}else{
			System.out.println("포함하지 않습니다.");
		}

	}

}
