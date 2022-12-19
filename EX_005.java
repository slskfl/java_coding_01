import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Scanner;

public class EX_005 {
	public static void main(String[] args) {
		// 005. 모음과 자음 세기
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		String[] data = {"a", "e", "i", "o", "u"};
		HashMap<String, Integer> hmap = new HashMap<>();
		int m =  0;
		
		for(int i=0; i<data.length; i++){
			String str = String.valueOf(data[i]);
			hmap.put(str, 0);
		}
		
		for(int i=0; i<sb.length(); i++){
			String tmp = String.valueOf(sb.charAt(i)).toLowerCase();
			
			if(hmap.containsKey(tmp)){
				int n =  hmap.get(tmp)+1;
				hmap.put(tmp, n);
			}else{
				m++;
			}
		}
		
		System.out.println("모음 : " + m + " , 자음 :" + hmap);
	}
	
}
