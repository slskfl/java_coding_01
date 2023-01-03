package ex.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;

public class EX_015 {

	public static void main(String[] args) {
		// 015. 문자열 배열을 길이 순으로 정렬
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		HashMap<String, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<n; i++){
			String str = scan.next();
			int len = str.length();
			hmap.put(str, len);
		}
		
		//Map.entry 리스트
		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(hmap.entrySet());
		
		//Collections.sort의 compare 이용
		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		for(Entry<String, Integer> entry : entryList) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
	}

}
