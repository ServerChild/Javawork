package list01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList03 {
	public static void main(String[] args) {
		// LinkedList : 모든 데이터가 데이터 부분과 주소 부분을 별도로 가지고 있음
		// 데이터는 포인터와 주소를 사용하여 연결
		LinkedList<Integer> list = new LinkedList<>();
		
		// 값 추가
		list.add(3); // 맨 끝에 추가
		list.add(1, 5); // index 1 위치에 추가
		list.addFirst(1); // 맨 앞에 추가
		list.add(7);
		
		// list에 있는 모든 값 출력
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println();

		
		// 값 삭제
		list.remove(1); // 해당 인덱스에 있는 값 삭제
		list.removeLast(); // 가장 뒤에 있는 값 삭제
		// = list.remove(list.size() - 1) -> removeLast 와 동일
		System.out.println();
		
		
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		
		// Iterator(반복자) : 컬렉션 프레임워크(Collection Framework)에 저장된 요소들을 순회해서 읽어옴
		// 컬렉션 프레임워크(Collection Framework) : 데이터 처리 방식을 구조화해서 설계해놓은 것 -> List, Set, Map, Queue 등이 해당
		Iterator<Integer> it = list.iterator();
		
		// hesNext() : 남아있는 객체가 있는지
		// next() : 순회하면서 값 얻어오기
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
		
	}
}
