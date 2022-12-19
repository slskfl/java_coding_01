import java.util.Scanner;

public class EX_002 {

	public static void main(String[] args) {
		// 002. 반복되지 않는 첫 번째 문자 찾기
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		for(int i =0; i<str.length(); i++){
			char chr = str.charAt(i);
			int cnt = 0;
			for(int j=0; j<str.length()-1; j++){
				if(i != j){
					char chr2 = str.charAt(j);
					if(chr == chr2){
						cnt++;
					}
				}
			}
			if(cnt == 0){
				System.out.println(chr);
				return;
			}
		}
	}
}
