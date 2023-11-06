package setMap02;

import java.util.*;

class Member {
	// 필드
	String name;
	int age;
	
	// 생성자
	public Member() { }
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }
	
	// 전체 출력
	@Override
	public String toString() {
		return "Member [name = " + name + ", age = " + age + "]";
	}
	
	@Override
	public int hashCode() { 
		return name.hashCode() + age; 
		// return Objects.hash(age, name);
	} 
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Member) {
			Member member = (Member)o;
			return (member.age == age) && (member.name.equals(name));
		}
		return false;
	}
}


public class HashSet02 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		
		System.out.println(set.size());
	}
}
