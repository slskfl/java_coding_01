package ex.self;

import java.util.Scanner;

public class EX_032 {

	public static void main(String[] args) {
		// 032. 두 불 표현식에 논리 AND/OR/XOR 적용
		// XOR : 입력 값이 같지 않을 경우 1, 같을 경우 0
		
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		String andStr = new String();
		String orStr = new String();
		String xorStr = new String();
		
		for(int i=0; i<str1.length(); i++){
			
			//AND 연산자
			if(str1.charAt(i)=='1' && str2.charAt(i)=='1'){
				andStr +='1';
			}else{
				andStr += '0';
			}
			
			//OR 연산자 
			if(str1.charAt(i)=='1' || str2.charAt(i)=='1'){
				orStr +='1';
			}else{
				orStr += '0';
			}
			

			//XOR 연산자 
			if(str1.charAt(i) != str2.charAt(i)){
				xorStr +='1';
			}else{
				xorStr += '0';
			}
		}
		
		System.out.println("AND : " + andStr);
		System.out.println("OR : " + orStr);
		System.out.println("XOR : " + xorStr);
	}

}
