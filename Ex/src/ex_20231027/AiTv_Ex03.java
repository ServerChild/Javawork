package ex_20231027;

public class AiTv_Ex03 extends SmartTv_Ex03 {
	String genre;
	String genre(String genre) {
		this.genre = genre;
		return this.genre + "를 보여줍니다.";
	}
}
