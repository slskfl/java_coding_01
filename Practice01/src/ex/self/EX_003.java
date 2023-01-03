package ex.self;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import org.w3c.dom.Text;

public class EX_003 {
	private static final Pattern PATTERN = Pattern.compile(" +");
	private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, " 
			+ "showed me that anything is possible and that you're never too young to think big. "
			+ "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, " 
			+ "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
			+ "computer science.";
	
	private static final String WHITESPACE = " ";
	
	public static void main(String[] args) {
		// 003. 글자와 단어 뒤집기
		/*Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		
		System.out.println(sb.reverse().toString());*/

		//공벡을 구분자로 사용하여 문자열을 단어 배열로 분리한다.
		String[] words= TEXT.split(WHITESPACE);
		StringBuilder reversedString = new StringBuilder();
		
		
		//해당하는 아스키 코드로 각 단어로 뒤집는다.
		for(String word : words) {
			StringBuilder reversedWord = new StringBuilder();
			for(int i=word.length()-1; i>=0; i--) {
				reversedWord.append(word.charAt(i));
			}
			//StringBuilder에 결과를 덧 붙인다.
			reversedString.append(reversedWord).append(WHITESPACE);
		}
		
		System.out.println(reversedString.toString());
		
		String result = reversedWords(TEXT);
		System.out.println(result);

	/*	Builder<String>  builder = Stream.builder();
		builder.accept(TEXT);
		Stream<String> stream = builder.build();
		stream.map(w -> new StringBuilder(w).reverse)
				.collect(Collectors.joining(" "));*/
	}

	private static String reversedWords(String str) {
		// TODO Auto-generated method stub
		return PATTERN.splitAsStream(str).map(w -> new StringBuilder(w).reverse()).collect(Collectors.joining(WHITESPACE));
	}
}
