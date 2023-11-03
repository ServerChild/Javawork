package list01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
	public static void main(String[] args) {
		/*
		 	ArrayList<>
		 	
		 	<제네릭> : 자료형이 무엇이 들어올지 모름, 사용할 때 자료형 넣음
		 		-> 갯수를 지정하지 않으면 기본 10개
		 */
		
		// 갯수지정 가능
		ArrayList<String> alist = new ArrayList<>(15);
		
		// 부모형으로 변환하여 사용
		List<String> list = new ArrayList<>();
		
		
		// 배열객체명.add() : ArrayList 배열에 값 추가
		list.add("Java");
		list.add("Oracle");
		list.add("HTML 5");
		list.add("JSP");
		
		
		// size() : 객체 수 출력
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		
		// 배열객체명.get() : 해당 인덱스에 있는 값 가져
		String list1 = list.get(2);
		System.out.println(list1);
		System.out.println();
		
		
		// 배열객체명.add(index, 값) : 해당 index 위치에 추가
		// 나머지 데이터들은 한 칸씩 다음 index로 이동
		list.add(2, "Spring");
		System.out.println("총 객체 수 : " + list.size());
		System.out.println(list.get(2));
		System.out.println();
		
		
		// 배열객체명.set(index, 값) : 해댱 index 위치에 있는 값 변경(기존 객체 변경)
		list.set(2, "SpringBoot");
		System.out.println("총 객체 수 : " + list.size());
		System.out.println(list.get(2));
		System.out.println();
		
		
		// 배열 안에 있는 모든 값 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		// remove(index or 객체명) : 해당하는 index, 객체명에 있는 값 삭제
		String removeStr = list.remove(0);
		System.out.println(removeStr);
		System.out.println();
		
		// 삭제 후 배열에 모든 값 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		// remove(객체명) 삭제 여부 boolean형으로 출력
		boolean re = list.remove("HTML 5");
		System.out.println(re);
		
		
		// ArrayList 배열 전체 값 삭제
		list.clear();
		System.out.println("총 객체 수 : " + list.size());
		System.out.println("ArrayList가 비어있는가? " + list.isEmpty());
		System.out.println();
		
		
		// <Object> : 매개변수에 모든 객체를 받을 때
		ArrayList alist2 = new ArrayList();
		
		alist2.add(1);
		alist2.add(3.1415);
		alist2.add("56");
		alist2.add(new String("88"));
		
		Object obj = alist2.get(0);
		int num = (int)obj; // 1
		double douNum = (double)alist2.get(1);
		int strNum1 = Integer.parseInt((String)alist2.get(2));
		int strNum2 = Integer.parseInt((String)alist2.get(3));
		
		System.out.println(num + douNum + strNum1 + strNum2);
		
	}
}
