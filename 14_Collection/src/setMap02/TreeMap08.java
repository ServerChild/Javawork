package setMap02;

import java.util.*;
import java.util.Map.Entry;

class Snack {
	// 필드(속성) : 맛, 칼로리
	private String flavor;
	private int calory;
	
	// 생성자
	public Snack() { }

	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}

	// toString
	@Override
	public String toString() {
		return "[ 맛: " + flavor + ", 칼로리: " + calory + " ]";
	}

	// getter, setter
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}
	
}


public class TreeMap08 {
	public static void main(String[] args) {
		// key : 과자명, value : Snack 객체
		HashMap<String, Snack> hashMap = new HashMap<>();
		
		// 값 선언 후 출력
		hashMap.put("먹태깡", new Snack("먹태맛", 280));
		hashMap.put("오예스 한개", new Snack("초코맛", 150));
		hashMap.put("새우깡", new Snack("매운맛", 410));
		hashMap.put("포테이토칩", new Snack("어니언맛", 333));
		
		System.out.println(hashMap);
		
		// 키값은 중복될 수 없으므로 원래 값이 변경된 값으로 출력
		hashMap.put("새우깡", new Snack("기본맛", 410));
		System.out.println(hashMap);
		
		
		// TreeMap : 이진트리를 기반으로 한 Map 컬렉션
		//  - 키와 값이 저장된 엔트리 저장, 키를 기준으로 정렬
		// 예시 1
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("forever", 60);
		treeMap.put("banana", 20);
		treeMap.put("discode", 90);
		treeMap.put("apple", 80);
		treeMap.put("cat", 70);
		treeMap.put("even", 10);
		treeMap.put("go", 30);
		
		// 값1(기본값 포함 o) 부터 값2(기본값 포함 x) 까지의 범위 내에 있는 값 출력
		NavigableMap ns = (NavigableMap)treeMap.subMap("c", "g");
		
		System.out.println(ns);
		System.out.println(treeMap.subMap("c", "g"));
		
		
		// 예시 2
		TreeMap<Integer, String> tMap = new TreeMap<>();
		
		tMap.put(89, "홍길동");
		tMap.put(57, "이길동");
		tMap.put(73, "박길동");
		tMap.put(97, "유길동");
		tMap.put(68, "나길동");
		
		// Entry : 엔트리 값으로 저장
		// 순서가 없이 저장
		Entry<Integer, String> entry = tMap.firstEntry();
		
		// entry : 키, 값 모두 얻어옴
		// entry.getKey() : key만 얻어올 때 , entry.getValue() : 값만 얻어올 때
		System.out.println("가장 낮은 점수 : " + entry);
		
		System.out.println("가장 높은 점수 : " + tMap.lastEntry());
		
		System.out.println("100점 아래 점수 : " + tMap.lowerEntry(100));
		
		System.out.println("73점보다 위의 점수 : " + tMap.higherEntry(73));
		
		System.out.println("73점과 동일한 점수 없으면 바로 아래 점수 : " + tMap.floorEntry(73));
		System.out.println("60점과 동일한 점수 없으면 바로 아래 점수 : " + tMap.floorEntry(60));
		
		System.out.println("73점과 동일한 점수 없으면 바로 위의 점수 : " + tMap.ceilingEntry(73));
		System.out.println("90점과 동일한 점수 없으면 바로 위의 점수 : " + tMap.ceilingEntry(90));
	}
}
