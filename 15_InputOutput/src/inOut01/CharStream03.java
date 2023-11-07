package inOut01;

import java.io.*;

public class CharStream03 {
	public static void main(String[] args) {
		/*
		  문자 스트림 : 데이터를 2byte 단위로 전송하는 통로
		  문자 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
		    - 문자 데이터를 읽고 출력할 때 사용
		  
		  xxxReader : 입력용 스트림
		  xxxWriter : 출력용 스트림
		*/
		// fileSave();
		fileRead();
	}
	
	// 파일 저장 메소드
	public static void fileSave() {
		FileWriter fw = null;
		
		try {
			// 파일에 이어쓰기 or 덮어쓰기 여부를 정할 때는 FileWriter(파일명, true or false)
			fw = new FileWriter("b_char.txt");
			
			// 값 입력 : 문자열, 문자, 배열 가능
			fw.write("한글 가능");
			fw.write('d');
			fw.write("\n");
			
			char[] arr = {'A', 'd', 'd', 'i', 'n'};
			fw.write(arr);
			fw.write("\n");
			
			char[] arrStr = {'김', '홍', '이'};
			fw.write(arrStr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // finally 안에 넣으면 무조건 실행
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 파일 읽기 메소드
	public static void fileRead() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			
			
			while((value = fr.read()) != -1) {
				// System.out.print(value); -> 유니코드 출력
				System.out.print((char)value);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
