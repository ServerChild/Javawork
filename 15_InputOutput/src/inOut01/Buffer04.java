package inOut01;

import java.io.*;

public class Buffer04 {
	public static void main(String[] args) {
		/*
		   Buffer : 보조 스트림(기반 스트림으로 부족한 성능을 향상시켜주는 스트림)
		   	- 기반 스트림에서 제공하지 않는 추가적인 메소드 제공(데이터 전송속도 향상 등)
		   	- 외부매체와 직접적으로 연결되지 않음
		   	- 단독사용 불가(반드시 기반 스트림과 함께 사용)
		 */
		// fileSave();
		fileRead();
	}
	
	
	// 파일 저장 메소드
	public static void fileSave() {
		// FileWriter(기반)
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림(속도 향상)(보조)
		// 순서 : 기반 스트림 생성 -> 보조 스트림 생성
		
		// FileWriter fw = null; // 기반
		BufferedWriter bw = null; // 보조
		
		try {
			// fw = new FileWriter("c_buffer.txt");
			// bw = new BufferedWriter(fw);
			
			// 한줄 표현
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			bw.write("안녕\n");
			bw.write("곧 즐거운 점심시간이야\n");
			bw.newLine(); // BufferedWriter에 있는 메소드 : 줄바꿈
			bw.write("배고파");
			
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		} 
		
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// try-with-resource 구문으로 자원반납까지 간단하게 작업할 수 있음
		//  - JDK7 버전이상부터 사용 가능
		/*
		 	try(try블럭 내에서 사용할 스트림 객체 생성 구문) {
		 	
		 	}
		 	
		 	catch(Exception e) {
		 	
		 	}
		 */
		
		// 파일 생성
		// 알아서 close() 해줌
		try(BufferedWriter bw2 = new BufferedWriter(new FileWriter("d_buffer.txt"))) {
			bw.write("안녕\n");
			bw.write("곧 즐거운 점심시간이야\n");
			bw.newLine(); // BufferedWriter에 있는 메소드 : 줄바꿈
			bw.write("배고파");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	
	// 파일 읽는 메소드
	public static void fileRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			String value = null;
			
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
