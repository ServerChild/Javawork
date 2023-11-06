package setMap02;

import java.util.*;

public class TreeSet07 {
	public static void main(String[] args) {
		// int 배열 선언
		int[] arrInt = {1, 4, 3, 6, 7, 1, 3, 4, 6, 8}; // 10개(중복 : 1, 3, 4, 6)
		
		// TreeSet 선언
		TreeSet<Integer> ts = new TreeSet<>();
		
		// 배열(arrInt)에 있는 값을 TreeSet(ts)에 넣음
		//  - 배열에서 TreeSet으로 값을 넣을 때 트리 구조로 만들면서 넣기때문에 오름차순 정렬함
		for(Integer o : arrInt) {
			ts.add(o);
		}
		
		System.out.println(Arrays.toString(arrInt));
		System.out.println(ts); // 오름차순 정렬로 출력
		
		
		// 내림차순 정렬 : descendingSet
		// 값을 NavigableSet 타입으로 반환함
		NavigableSet<Integer> arrDesc = ts.descendingSet();
		
		System.out.println(arrDesc);
		
	}
}
