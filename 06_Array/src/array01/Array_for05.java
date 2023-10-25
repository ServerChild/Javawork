package array01;

import java.util.Arrays;

public class Array_for05 {
	public static void main(String[] args) {
		// 향상된 for문 : 배열에서만 사용
		// for(자료형 변수 : 배열) : 배열의 처음부터 끝까지 순서대로 돌때만 사용 가능
		// 예시 1
		int num[] = {1, 2, 3, 4, 5};
		
		for(int result : num) {
			System.out.println(result);
		}
		System.out.println();
		
		// 예시 2
		String name[] = {"홍길동", "아무개", "졸려요"};
		
		for(String str : name) {
			System.out.println(str);
		}
		System.out.println();
		
		// 예시 3
		String name1[] = new String[3];
		int index = 0;
		
		for(String str : name) {
			name1[index++] = str;
			
			// 전위 연산자(--index)를 하면 index[0] 자리에 모든 값 저장하기 때문에 -1을 해줘야 함
			System.out.println(name1[index - 1]);
		}
		System.out.println(Arrays.toString(name1));
	}
}
