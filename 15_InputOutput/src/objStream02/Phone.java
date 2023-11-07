package objStream02;

import java.io.Serializable;

/*
  - 객체 자체를 입출력하고자 하면 반드시 직렬화 과정이 필수
  	- 직렬화(serialization) : 객체를 스트림으로 만드는 작업
  	  -> 멤버변수만 직렬화 대상
  	  -> 사용하는 이유 : 객체를 만들어 놓은 것들은 언젠가 소멸되기 때문에
  	  					미리 파일로 만들어 놓으면 필요할 때 다시 복원해서 사용가능
 */

// implements Serializable : 직렬화
public class Phone implements Serializable{
	// 필드
	private String name;
	private int price;
	
	// 생성자
	Phone() {}
	
	Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 모든 정보 출력
	@Override
	public String toString() {
		return "[ 핸드폰 이름 : " + name + ", 가격 : " + price + " ]";
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
