import java.util.Scanner;

public class EX_003 {

	public static void main(String[] args) {
		// 003. 글자와 단어 뒤집기
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		
		System.out.println(sb.reverse().toString());

	}

}
