package ex_20231107;

public class Grade extends Student {
	// 필드(속성)
	private int kor;
	private int eng;
	private int com;
	private int math;
	
	// 생성자
	public Grade() {}

	public Grade(int kor, int eng, int com, int math) {
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.math = math;
	}
	
	public Grade(String id, String name, String password, int age, int kor, int eng, int com, int math) {
		super(id, name, password, age);
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.math = math;
	}

	// 전체 총합 점수
	public int getTotalScore() {
		return kor + eng + com + math;
	}
	
	// 전체 점수의 평균
	public double getAvg() {
		return (kor + eng + com + math) / 4.0;
	}
	
	// getter, setter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
