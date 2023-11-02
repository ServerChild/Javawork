package odject01;

import java.util.Arrays;

class Point implements Cloneable {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	@Override
	public Object clone(){
		Object o = null;
		
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return o;
	}
}


public class Clone04 {
	public static void main(String[] args) {
		// clone() 메소드 : 객체 자신의 복사본을 반환(거의 사용 x)
		Point originP = new Point(3, 5);
		Point copy = (Point)originP.clone(); // 부모객체를 자식객체로 형변환
		
		System.out.println(originP);
		System.out.println(copy);
		
		// 복제해서 객체를 하나 더 만들었기 때문에 해시코드값이 다름, 같은 값을 출력하려면 오버라이딩 필요
		System.out.println(originP.hashCode());
		System.out.println(copy.hashCode());
		
		
		// 배열 복제 : 원래 배열과 복제 배열이 따로 생성됨(객체가 따로 생성됨)
		// clone() 메소드 사용
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrClone = arr.clone();
		
		// arraycopy() 사용
		System.arraycopy(arr, 0, arrClone, 0, arr.length);
		
		// 출력
		System.out.println(arrClone[0]);
		
		arrClone[0] = 9;
		System.out.println(arr[0]);
		System.out.println(arrClone[0]);
		
		
	}
}
