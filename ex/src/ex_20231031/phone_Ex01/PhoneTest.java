package ex_20231031.phone_Ex01;

public class PhoneTest {
	public static void main(String[] args) {
		Phone phone1 = new SmartPhone("아무개");
		Phone phone2 = new FolderPhone("홍길동");
		
		
		phone1.information();
		phone1.turnOn();
		phone1.turnOff();
		
		System.out.println();
		
		phone2.information();
		phone2.turnOn();
		phone2.turnOff();
		
		SmartPhone sp = new SmartPhone();
		sp.search("컴퓨터");
		
		FolderPhone fp = new FolderPhone();
		fp.message("안녕하세요");
	}
}
