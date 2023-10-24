package array01;

public class Array_int01 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터를 연속된 공간에 나열해 저장하고, 각 데이터에 인덱스(index)를 부여한 자료구조
		// 		- 배열의 길이는 늘리거나 줄일 수 없음
		//		- 형식 : 자료형[] 변수명 = new 자료형[갯수]
		//				자료형 변수명[] = new 자료형[갯수]
		
		// 저장 공간을 확보만 하고 값은 나중에(갯수를 반드시 적어줘야 함)
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[5];
		
		// 배열을 만들면서 값 할당
		int arrayInt3[] = {1, 2, 3, 4, 5}; // 인덱스(index) = {0 1 2 3 4}
		
		// 배열 내에 해당 인덱스 가진 값 출력
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[3]);
		System.out.println("===============");
		
		arrayInt3[1] = 20;
		
		// 배열에 있는 모든 값 출력
		for(int i = 0; i <= 4; i++) {
			if(i==4) 
				System.out.println(arrayInt3[i]);
			else
				System.out.print(arrayInt3[i] + ", ");
		}
		System.out.println("===============");
		
		// {0, 2, 4, 6, 8}로 값을 변경할 때
		for(int i = 0; i <= 4; i++) {
			arrayInt3[i] = i * 2;
		}
		for(int i = 0; i <= 4; i++) {
			if(i==4) 
				System.out.println(arrayInt3[i]);
			else
				System.out.print(arrayInt3[i] + ", ");
		}
		System.out.println("===============");
		
		// 배열의 길이 : 배열명.length()
		int arr[] = {3, 4, 5, 6, 7};
		int arr1[] = new int[10];
		System.out.println("arr의 길이 : " + arr.length);
		System.out.println("arr1의 길이 : " + arr1.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
