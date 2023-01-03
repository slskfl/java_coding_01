package ex.self;

import java.util.Scanner;

public class EX_017 {

	public static void main(String[] args) {
		// 017. 문자열 내 부분 문자열 빈도수 세기
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		StringBuffer tmpsb = new StringBuffer(scan.next());

		String str = String.valueOf(sb);
		String tmpStr = String.valueOf(tmpsb);
		
		if(str.contains(tmpStr)){
			int n = 0;
			while(str.contains(tmpStr)){
				str = str.replaceFirst(tmpStr	,"");
				n++;
			}
			System.out.println(n);
		}else{
			System.out.println(0);
		}
	}

}
