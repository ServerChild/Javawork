package ex_20231026;

public class ProductTest {
	public static void main(String[] args) {
		Product po1 = new Product("id_1", "우산", "편의점", 4500, 3.3);
		Product po2 = new Product("id_2", "인형", "백화점", 25000, 3.3);
		Product po3 = new Product("id_3", "마우스", "전자상가", 15000, 3.3);
		
		System.out.println("[ 제품 목록 ]");
		System.out.println(po1.information());
		System.out.println(po2.information());
		System.out.println(po3.information());
		System.out.println();
		
		// 가격 120만원으로 변경
		System.out.println("[ 모든 제품 가격 변경 및 부가세율 변경 ]");
		po1.setPrice(1200000);
		po2.setPrice(1200000);
		po3.setPrice(1200000);
		
		// 부가세율 0.05로 변경
		po1.setTax(0.05);
		po2.setTax(0.05);
		po3.setTax(0.05);
		
		System.out.println(po1.information());
		System.out.println(po2.information());
		System.out.println(po3.information());
		System.out.println();
		
		// 가격에 부가세율 적용한 실제 가격
		// 부가세 포함 가격 = 가격 + (가격 * 부가세율)
		System.out.println("제품 1의 부가세 포함 가격 : " + po1.getRePrice());
		System.out.println("제품 2의 부가세 포함 가격 : " + po2.getRePrice());
		System.out.println("제품 3의 부가세 포함 가격 : " + po3.getRePrice());
	}
}
