package inOut01;

import java.io.*;

// 스트림(Stream) : 자바에서 데이터는 스트림을 통해 입출력
public class ByteStream02 {
	public static void main(String[] args) {
		/* 
		   바이트 스트림 : 1byte를 전송함(한글은 깨짐)
		   바이트 기반 스트림 : 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력
			 - 외부매체와 직접적으로 연결되는 통로
			 - xxxInputStream : xxx 매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어옴)
			 - xxxOutputStream : xxx 매체로부터 데이터를 출력하는 통로
		*/
		
		/*
		    - write(int b) : 1 byte 출력
				+ 매개 변수로 주어지는 int(4 byte)에서 1byte만 출력 스트림으로 보냄
  			- write(byte[] b) : 배열 b의 모든 바이트 출력(모두 출력)
  			- write(byte[] b, int off, int len) : 주어진 배열 b[off]부터 len개까지의 바이트 출력(범위 출력)
  			- flush() : 잔류하는 모든 바이트를 비움
  			- close() : 출력 스트림 닫음
		 */
		
		// fileSave();
		fileRead();
	}
	
	// 파일 저장(출력) 메소드 
	static void fileSave() {
		// FileOutputStream : 파일과 직접적으로 연결하여 1바이트 단위로 출력하는 스트림
		// 순서 : 스트림 생성(통로 만들기) -> 스트림 데이터 출력(메소드 활용) -> 사용 후 스트림 반납
		
		FileOutputStream fout = null;
		
		try {
			/* 
			   new FileOutputStream("파일명", true(or false))
				- false(기본값) : 파일에 데이터가 있어도 덮어쓰기
				- true : 파일에 데이터가 있으면 그 아래에 쓰기
			*/
		
			// 1. 스트림 생성(통로 만들기)
			fout = new FileOutputStream("a_byte.txt"); // 파일이 없으면 만들고, 있으면 그 파일 이용
			
			// 2. 스트림 데이터 출력 : 값 하나씩 저장
			fout.write(65);
			fout.write('b');
			
			// 배열 값 저장 -> 배열의 값이 문자로 들어감
			byte[] bArr = {97, 99, 100};
			fout.write(bArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. 사용 후 스트림 반납(반드시 해야함)
		try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 파일 읽는(입력) 메소드
	public static void fileRead() {
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력하는 스트림
		// 순서 : 스트림 생성(통로 만들기) -> 스트림 데이터 입력받아옴(메소드 활용) -> 사용 후 스트림 닫기
		
		FileInputStream fin = null;
		
		try {
			// 1. 스트림 생성(통로 만들기)
			fin = new FileInputStream("a_byte.txt");
			
			// read() : 한글자씩 유니코드 숫자로 읽어옴
			// 다 읽고나면 -1이 반환됨
			// System.out.println(fin.read());
			
			
			// fin.read는 while(조건문에서도 읽고) { 파일에서도 읽음 }
			// fin.read()이 나온 횟수만큼 출력(2번 -> 2개) = 하나씩 건너뛰어서 출력
			/*
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}
			*/
			
			// 해결 예제 1
			// 반드시 fin.read() 호출은 한번만해야 한글자 출력
			/*
			while(true) {
				int value = fin.read();
				if(value != -1)
					break;
				System.out.println(value);
			}
			*/
			
			// 해결 예제 2(권장하는 방법)
			int result = 0;
			
			while((result = fin.read()) != -1) {
				System.out.println((char)result);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. 사용 후 스트림 닫기
		try {
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
