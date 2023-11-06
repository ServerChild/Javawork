package setMap02;

import java.util.*;

public class HashSet03 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45) + 1); // 랜덤 숫자 1 ~ 45까
		}
		
		// 순서대로 출력
		// index가 없기 때문에 할 수 없음 -> List로 변경 후 사용
		List list = new LinkedList(set);
		
		// Collections.sort() : 클래스의 객체 정렬
		// 오름차순(sort) : 한글 > 소문자 > 대문자 > 숫자
		// 내림차순(reverse) : 숫자 > 대문자 > 소문자 > 한
		Collections.sort(list);
		
		System.out.println(list);
	}
}
