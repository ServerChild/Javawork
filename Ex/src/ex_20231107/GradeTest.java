package ex_20231107;

import java.util.*;

public class GradeTest {
	public static void main(String[] args) {
		int select; // 사용자로부터 입력받은 선택 번호
		boolean check = false; // 로그인 되었는지 체크
		ArrayList<Grade> glist = new ArrayList<>(); // 학생정보 및 점수를 입력받아 저장
		int gListIndex = 0; // 로그인 된 후 출력시 필요한 index 번호
		
		Grade gd = new Grade();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====================================");
			System.out.println("1. 학생 정보 및 점수 입력");
			System.out.println("2. login(출력은 login이 되어야만 출력 가능)");
			System.out.println("3. 학생 정보 출력");
			System.out.println("4. 합계와 평균 출력");
			System.out.println("5. logout");
			System.out.println("6. 프로그램 종료");
			System.out.println("------------------------------------");
			
			System.out.print("번호를 선택하세요 : ");
			select = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(select) {
			case 1:
				System.out.print("id 입력 : ");
				gd.setId(sc.next());
				
				System.out.print("이름 입력 : ");
				gd.setName(sc.next());
				
				System.out.print("비밀번호 입력 : ");
				gd.setPassword(sc.next());
				
				System.out.print("나이 입력 : ");
				gd.setAge(sc.nextInt());
				
				System.out.print("국어 점수 입력 : ");
				gd.setKor(sc.nextInt());
				
				System.out.print("영어 점수 입력 : ");
				gd.setEng(sc.nextInt());
				
				System.out.print("컴퓨터 점수 입력 : ");
				gd.setCom(sc.nextInt());
				
				System.out.print("수학 점수 입력 : ");
				gd.setMath(sc.nextInt());
				
				glist.add(gd);
				break;
			case 2:
				int count = 0;
				
				for(int i = 0; i < 3; i++) {
					System.out.print("ID를 입력하세요 : ");
					String inId = sc.next();
					
					System.out.print("PASSWORD를 입력하세요 : ");
					String inPw = sc.next();
					
					if(gd.getId().equals(inId) && gd.getPassword().equals(inPw)) {
						check = true;
						System.out.println("로그인 성공");
						break;
					}
					else if(gd.getId() != inId || gd.getPassword() != inPw) {
						count += 1;
						System.out.println("ID 혹은 PASSWORD가 틀렸습니다. 다시 입력하세요.");
					}
					
					if(count > 2) {
						System.out.println("3번의 로그인에 실패하였습니다. 본인확인이 필요합니다.");
					}
				}
				break;
			case 3:
				if(check == false) {
					System.out.println("로그인 후에만 출력가능합니다.");
				}
				else
					System.out.println(gd.toString());
				break;
			case 4:
				System.out.println("합계 : " + gd.getTotalScore());
				
				System.out.printf("평균 : %.1f\n", gd.getAvg());
				
				break;
			case 5:
				check = false;
				System.out.println("로그아웃 되었습니다.");
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;	
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");	
			}
		}
	}
}
