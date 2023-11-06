package setMap02;

import java.util.*;

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
		// TreeMap : 이진트리를 기반으로 한 Map 컬렉션
		//  - 키와 값이 저장된 엔트리 저장, 키를 이용해 정렬
		
		// key : 과자명, value : Snack 객체
		HashMap<String, Snack> map = new HashMap<>();
		
		// 값 선언 후 출력
		map.put("먹태깡", new Snack("먹태맛", 280));
		map.put("오예스 한개", new Snack("초코맛", 150));
		map.put("새우깡", new Snack("매운맛", 410));
		map.put("포테이토칩", new Snack("어니언맛", 333));
		
		System.out.println(map);
		
		// 키값은 중복될 수 없으므로 정보가 변경된 값으로 출력
		map.put("새우깡", new Snack("기본맛", 410));
		System.out.println(map);
	}
}
