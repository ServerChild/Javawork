package inOut01;

import java.io.File;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) throws IOException {
		// 간단한 파일 만들때 : java.io.File 클래스 사용
		
		// 파일 생성(경로 지정 안하면 해당 프로젝트에 파일 생성)
		// 반드시 createNewFile() 메소드를 호출해야 생성됨 
		File f1 = new File("test.txt");
		f1.createNewFile();
		
		
		// 파일 생성(경로 지정(경로주소/파일명))
		// File f2 = new File("C:\\test01.txt"); -> 역슬래쉬(\) 사용할때는 2개 넣어줘야 함
		File f2 = new File("C:/Users/Public/test01.txt"); // 슬래쉬(/) 경로 지정할때 사용
		f2.createNewFile();
		
		
		// mkdir : 폴더 생성 명령어
		File folderMk = new File("C:/Users/Public/temp");
		folderMk.mkdir();
		
		File f3 = new File("C:/Users/Public/temp/test02.txt");
		f3.createNewFile();
		
		
		// exists() : 파일 존재유무 확인(true or false)
		System.out.println(f1.exists());
		
		// 객체만 선언하고 생성하지 않았기 때문에 존재 x
		System.out.println(new File("test03.txt").exists());
		
		// isFile() : 파일인지 아닌지 확인(true or false)
		System.out.println(f1.isFile());
		
		// isDirectory() : 폴더인지 아닌지 확인(true or false)
		System.out.println(folderMk.isDirectory());
	}
}
