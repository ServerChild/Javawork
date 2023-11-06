package setMap02;

import java.util.*;

public class TreeSet06 {
	public static void main(String[] args) {
		// TreeSet : 이진트리를 이용한 Set, 빠른 검색 가능
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 값 추가
		scores.add(87);
		scores.add(50);
		scores.add(34);
		scores.add(98);
		scores.add(25);
		
		
		// first() : 가장 낮은 객체(맨 왼쪽 + 맨 밑, 제일 작은 숫자)
		System.out.println("가장 낮은 점수 : " + scores.first());
		
		
		// last() : 제일 높은 객체(맨 오른쪽 + 맨 밑, 제일 높은 숫자)
		System.out.println("가장 높은 점수 : " + scores.last());
		
		
		// lower(객체값) : 주어진 객체보다 바로 아래 객체
		System.out.println("100점 아래 점수 : " + scores.lower(98));
		
		
		// higher(객체값) : 주어진 객체보다 바로 위 객체
		System.out.println("50점보다 위의 점수 : " + scores.higher(50));
		
		
		// floor(객체값) : 동등한 객체 있으면 리턴, 없으면 바로 아래 객체 리턴
		System.out.println("50점과 동일한 점수 없으면 바로 아래 점수 : " + scores.floor(50));
		System.out.println("50점과 동일한 점수 없으면 바로 아래 점수 : " + scores.floor(45));
		
		
		// ceiling(객체값) : 동등한 객체 있으면 리턴, 없으면 바로 위 객체 리턴
		System.out.println("50점과 동일한 점수 없으면 바로 위의 점수 : " + scores.ceiling(50));
		System.out.println("50점과 동일한 점수 없으면 바로 위의 점수 : " + scores.ceiling(55));
		
		
		// headSet() : 주어진 객체보다 낮은 객체들을 NavigableSet 타입으로 리턴
		//  - 주어진 객체 포함 여부는 두번째 매개값에 따라 다름
		//  - 형식 : headSet(점수, 본인포함여부(기본값 false))
		System.out.println("87점보다 낮은 점수들 : " + scores.headSet(87, true)); // 본인 포함 o
		
		
		// tailSet() : 주어진 객체보다 높은 객체들을 NavigableSet 타입으로 리턴
		//  - 형식 : tailSet(점수, 본인포함여부(기본값 true))
		System.out.println("87점보다 높은 점수들 : " + scores.tailSet(87));
		
		
		// subSet() : 주어진 시작 객체와 끝 객체 사이 범위에 있는 객체들을  NavigableSet 타입으로 리턴
		//  - 형식 : subSet(시작점수, 시작점수 포함여부(기본값 true), 끝 점수, 끝 점수 포함여부(기본값 false))
		System.out.println("74 ~ 100점 사이의 점수들 : " + scores.subSet(74, 100));
		System.out.println("74 ~ 100점 사이의 점수들 : " + scores.subSet(74, false, 100, true));
				
				
		// pollFirst() : 제일 낮은 객체 꺼내오고 컬렉션에서 삭제
		System.out.println("가장 낮은 점수 삭제 : " + scores.pollFirst());
		System.out.println(scores);
		
		
		// pollLast() : 제일 높은 객체 꺼내오고 컬렉션에서 삭제
		System.out.println("가장 높은 점수 삭제 : " + scores.pollLast());
		System.out.println(scores);
		
		
		
	}
}
