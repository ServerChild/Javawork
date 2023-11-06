package setMap02;

import java.util.*;

public class HashSet01 {
	public static void main(String[] args) {
		// Set(집합) : 특정한 값들을 저장하는 추상자료형
		// 값들의 순서가 존재하지 않으며 중복되지 않음
		
		// 구현 클래스 
		// 	- HashSet(데이터 중복, 순서 보장 x)
		// 	- TreeSet(HashSet 특정 + 오름차순 데이터 정렬)
		// 	- LinkedHashList(데이터 중복 저장 x, 입력 순서대로 데이터 저장)
		
		Object[] oArr = {"1", "2", "2", "3", "3", "3", "4", "4", "4", "4"};
		
		Set set1 = new HashSet();
		
		for(Object o : oArr) {
			set1.add(o);
		}
		
		System.out.println("set의 길이 : " + set1.size());
		System.out.println(set1);
	}
}
