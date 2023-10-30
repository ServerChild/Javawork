package ex_20231030.Polymorphism_EX;

import java.util.Arrays;

public class Buyer2 {
	int money = 10000;
	int bonusPoint;
	Product[] proList = new Product[3];
	int count;
	int sum;
	String list = "";
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없음");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		proList[count++] = p;
		
		System.out.println(p + " 구입");
	}
	
	void buyList() {
		// 물건을 산 총 금액
		// 물건 list
		// 풀이 1
		for(int i = 0; i < proList.length; i++) {
			sum += proList[i].price;
			list += proList[i] + " ";
		}
		
		/*// 풀이 2
			for(Product pro : proList) {
				sum += pro.price;
				list += pro.toString();
			}
		*/
		
		System.out.println("산 물건 총 금액은 " + sum + "원 입니다.");
		System.out.println("산 물건 List는 " + list + "입니다.");
		// System.out.println(Arrays.toString(proList)); -> 물건 list(내 풀이)
	}
}
