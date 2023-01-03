package ex.self;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EX_002 {
	private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, " 
			+ "showed me that anything is possible and that you're never too young to think big. "
			+ "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, " 
			+ "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
			+ "computer science.";

	public static void main(String[] args) {
		// 002. 반복되지 않는 첫 번째 문자 찾기
		/*Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		for(int i =0; i<TEXT.length(); i++){
			char chr = TEXT.charAt(i);
			int cnt = 0;
			for(int j=0; j<TEXT.length()-1; j++){
				if(i != j){
					char chr2 = TEXT.charAt(j);
					if(chr == chr2){
						cnt++;
					}
				}
			}
			if(cnt == 0){
				System.out.println(chr);
				return;
			}
		}*/
		
		Map<Character, Integer> chars = new LinkedHashMap<>();
		
		for(int i=0; i<TEXT.length(); i++) {
			
			
			char ch = TEXT.charAt(i);
			chars.compute(ch,  (k,v) -> (v == null ? 1 : ++v));
		}
		
		for(Map.Entry<Character, Integer> entry : chars.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
		System.out.println("result : " + Character.valueOf(Character.MIN_VALUE));
	}
}
