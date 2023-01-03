package ex.self;

import java.util.Scanner;

public class EX_006 {

	public static void main(String[] args) {
		// 006. 문자 빈도수 세기
		
		Scanner scan = new Scanner(System.in);
		String sb = scan.next();
		char chr = scan.next().charAt(0);
		
		if(!sb.contains(String.valueOf(chr))){
			System.out.println(0);
		}else{
			int idx =  sb.indexOf(String.valueOf(chr));
			int cnt = 0;
			for(int i = idx; i<sb.length(); i++){
				if(chr == sb.charAt(i)){
					cnt ++;
				}
			}
			System.out.println(cnt);
		}
		

	}

}
