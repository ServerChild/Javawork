package ex_20231030.Polymorphism_EX;

import java.util.ArrayList;

public class Buyer3 {
	int money = 10000;
	int bonusPoint;
	ArrayList<Product> aList = new ArrayList<Product>();
	
	// 구매
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없음");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		aList.add(p);
		
		System.out.println(p + " 구입");
	}
	
	// 반품
	void re(Product p) {
		if(aList.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			
			System.out.println(p + " 반품 완료되었습니다.");
		}
		else System.out.println("구입한 상품이 아닙니다.");
	}
	
	// 물건을 산 총 금액, 물건 list
	void buyList() {
		int sum = 0;
		String list = "";
		
		if(aList.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
			return;
		}
		
		for(int i = 0; i < aList.size(); i++) {
			Product p1 = aList.get(i);
			sum += p1.price;
			list += p1.toString() + " ";
		}
		
		System.out.println("산 물건 총 금액은 " + sum + "원 입니다.");
		System.out.println("산 물건 List는 " + list + "입니다.");
	}
	
}
