package ex_20231031.book_Ex03;

public class Member extends LibraryController {
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
	
	public String toString() {
		return "회원명 : " + name + " " + "회원나이 : " + age + " " + "성별 : " + gender;
	}
}
