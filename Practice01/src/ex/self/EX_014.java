package ex.self;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class EX_014 {

	public static void main(String[] args) {
		// 014. 빈도수가 가장 높은 문자 찾기
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.nextLine());
		HashMap<String, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<sb.length(); i++){
			if(hmap.containsKey(String.valueOf(sb.charAt(i)))){
				int n = hmap.get(String.valueOf(sb.charAt(i))) + 1;
				hmap.put(String.valueOf(sb.charAt(i)),n);
			}else{
				hmap.put(String.valueOf(sb.charAt(i)),0);
			}
		}
		
		List<Entry<String, Integer>> entryList = new ArrayList<>(hmap.entrySet());
		
		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		System.out.println(entryList.get(0));
		System.out.println(String.valueOf(Character.MIN_VALUE));
	}

}
