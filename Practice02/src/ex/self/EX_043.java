package ex.self;

import java.util.Arrays;
import java.util.List;

public class EX_043 {

	public static void main(String[] args) {
		//043.null 참조 검사와 기본 참조 반환 : 주어진 참조에 null 검사를 수행해서 null이 아니면 반환하고  null이면  null이 아닌 기본 참조를 반환하는 프로그램
		
		List<String> list = Arrays.asList("a", "1", "c", "e");
		
		listNullChkContains(list);
	}
	
	private static void listNullChkContains(List<String> list) {
		if(list.contains(null)) {
			throw new NullPointerException("contains : null을 참조했습니다");
		}else if (list.contains("")) {
			throw new IllegalArgumentException("contains : '''을 참조했습니다.");
		}
		
		String result = new String();
		for(String str : list) {
			result += str;
		}
		
		System.out.println(result);
	}

}
