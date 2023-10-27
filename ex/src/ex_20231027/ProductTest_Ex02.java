package ex_20231027;

class Product {
	// 변수
	static int count;
	int serialNo;
	
	// 생성자
	Product() { 
		++count;
		serialNo = count;
	}

}


public class ProductTest_Ex02 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호 : " + p1.serialNo);
		System.out.println("p2의 제품번호 : " + p2.serialNo);
		System.out.println("p3의 제품번호 : " + p3.serialNo);
		
		System.out.println("생산된 총 제품 수 : " + Product.count);
	}
}
