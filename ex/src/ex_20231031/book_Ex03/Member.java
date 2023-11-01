package ex_20231031.book_Ex03;

public class Member {
	// 필드 : 회원명, 회원나이, 성별, (쿠폰 개수)
	private String name;
	private int age;
	private char gender;
	
	
	// 생성자
	public Member(){}
	
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "회원명 : " + name + " , 회원나이 : " + age + " , 성별 : " + gender;
	}

	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
