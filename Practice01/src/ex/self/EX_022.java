package ex.self;

import java.util.Scanner;

public class EX_022 {

	public static void main(String[] args) {
		// 022. 가장 긴 공통 접두사 찾기

		Scanner scan = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer(scan.next());
		StringBuffer sb2  = new StringBuffer(scan.next());
		String result = new String();
		
		for(int i=0; i<(sb1.length() > sb2.length()? sb1.length() : sb2.length()); i++) {
			if(sb1.charAt(i) != sb2.charAt(i)){
				break;
			}else{
				result += String.valueOf(sb1.charAt(i));
			}
		}
		System.out.println(result);
	}

}
