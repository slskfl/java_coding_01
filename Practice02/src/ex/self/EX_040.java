package ex.self;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EX_040 {

	public static void main(String[] args) {
		//040.함수형 스타일과 절차적 코드에서 null 참조 검사 : 함수형 스타일과 절차적 코드에서 주어진 참조에 null 검사를 수행하는 프로그램
		
		List<Integer> list = Arrays.asList(1, null, 3, null, 4);
		
		String basic = listNullChkBasic(list);
		System.out.println("basic : " + basic);
		
		int sum = sumIntegers(list);
		System.out.println("sum : " + sum);
	}
	
	private static String listNullChkBasic(List<Integer> list) {
		
		if(Objects.isNull(list)) {
			return "List is null";
		}
		
		String result = new String();
		for(Integer nr : list) {
			if(nr ==null) {
				result += String.valueOf("-");
			}else {
				result += String.valueOf(nr);
			}
		}

		return result;
	}
	
	
	private static int sumIntegers(List<Integer> integers) {
		return integers.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum();
	}
}
