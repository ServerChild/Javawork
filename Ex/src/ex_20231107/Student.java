package ex_20231107;

public class Student {
	// 필드(속성)
	private String id;
	private String name;
	private String password;
	private int age;
	
	// 생성자
	public Student() {}

	public Student(String id, String name, String password, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

	// 전체 정보 출력
	@Override
	public String toString() {
		return name + "의 정보 : " + name + "의 정보" + "[id = " + id +", age = " + age + "]";
	}

	// getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
