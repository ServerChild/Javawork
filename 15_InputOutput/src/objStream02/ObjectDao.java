package objStream02;

import java.io.*;

public class ObjectDao {
	// 파일 저장(입력) 메소드
	// 기반 스트림 : FileOutputStream(1byte)
	// 보조 스트림 : ObjectOutputStream(객체 단위로 출력할 수 있도록 도움을 주는 보조 스트림) -> ObjectWriter 없음
	public void fileSave() {
		Phone ph1 = new Phone("아이폰", 1300000);
		Phone ph2 = new Phone("갤럭시", 2000000);
		Phone ph3 = new Phone("갤럭시노트", 1800000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 파일 출력 메소드
	// 기반 스트림 : FileInputStream(1byte)
	// 보조 스트림 : ObjectInputStream(객체 단위로 가져올 수 있도록 도움을 주는 보조 스트림)
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			// EOFException : 파일의 끝을 만나는 순간 예외 발생
			/*System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// IOException 전에 처리해야 함
		catch(EOFException e) {
			System.out.println("파일 끝");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
