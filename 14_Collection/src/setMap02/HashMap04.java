package setMap02;

import java.util.*;

public class HashMap04 {
	public static void main(String[] args) {
		// Map : 순서 없음, 키는 중복 불가 / 값은 중복 가능
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 값 추가
		map.put(1, "홍길동");
		
		// 같은 키에 넣으면 값 변경
		map.put(2, "아무개");
		map.put(2, "이길동");
		
		System.out.println(map);
		System.out.println();
		
		// 예시 1
		Map<String, Double> map2 = new HashMap<String, Double>();
		
		map2.put("java", 34.55);
		map2.put("oracle", 87.678);
		map2.put("html", 14.892);
		
		System.out.println(map2);
		System.out.println(map2.get("html"));
		System.out.println(map2.remove("html"));
		System.out.println(map2);
		System.out.println();
		
		
		mapPrint(map);
	}
	
	// Map에는 순서가 없기 때문에(즉, 인덱스 번호가 없음) 특정 값을 꺼내오기 위해 Set에 담은 후 하나씩 꺼내옴
	static void mapPrint(Map<Integer, String> map) {
		Set<Integer> keyset = map.keySet(); 
		
		Iterator<Integer> keyIterator = keyset.iterator();
		
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			String value = map.get(key);
			
			System.out.println(key + " : " + value);
		}
	}
}
