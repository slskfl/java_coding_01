package ex.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EX_018 {

	public static void main(String[] args) {
		// 018. 두 문자열이 애너그램인지 검사
		// 애너그램은 같은 문자를 이용해 다른 단어가 되는 것으로, Dormitory >> Dirty Room
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.next();
		String str2 = scan.next();
		
		/*if(str1.length() != str2.length()){
			System.out.println("애너그램 아닙니다.");
			return;
		}*/
		
		char[] chr1 = new char[str1.length()];
		char[] chr2 = new char[str2.length()];
		
		for(int i = 0; i<str1.length(); i++){
			chr1[i] = str1.charAt(i);
			chr2[i] = str2.charAt(i);
		}
		
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		
		if(String.valueOf(chr1).equals(String.valueOf(chr2))){
			System.out.println("애너그램입니다.");
		}else{
			System.out.println("애너그램 아닙니다.");
		}
	}

}
