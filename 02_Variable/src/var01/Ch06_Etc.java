package var01;

public class Ch06_Etc {
	public static void main(String[] args) {
		// long(정수형), float(실수형)
		int int1 = 1111111111;
		
		// 숫자 뒤에 L(l) : 자동형변환으로 long 형이 됨
		long long1 = 1111111111234567890L;
		
		// 숫자 뒤에 F(f) : 자동형변환으로 float 형이 됨
		float float1 = 2.123123F;
		
		// 자료형의 범위를 미리 만들어놓은 클래스 사용
		// 문자형은 강제 형변환을 해줘야 수치값으로 나타내줌
		System.out.println("byte 크기 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short 크기 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int 크기 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("double 크기 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
		System.out.println("float 크기 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("char 크기 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
	}
}
