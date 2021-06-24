package streamProblem;

import java.util.ArrayList;
import java.util.List;

//스트림을 활용하여 패키지 여행 비용 계산하기
/*여행사에 패키지 여행 상품이 있습니다. 
 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 입니다. 
 * 고객 세 명이 패키지 여행을 떠난다고 했을 때 비용 계산과 고객 명단 검색등에 대한 연산을 
 * 스트림을 활용하여 구현해 봅니다.
 * 고객에 대한 클래스를 만들고 ArrayList로 고객을 관리 합니다. 
 * 
 * 해야 할 일
 * 고객의 명단을 출력합니다.
 * 여행의 총 비용을 계산합니다.
 * 고객 중 20세 이상인 사람의 이름을 정렬하여 출력합니다.
 * 
 */

public class streamProblem {
	
	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이승기", 35, 100);
		TravelCustomer customerKim = new TravelCustomer("김동현", 10, 50);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		TravelCustomer customerKang = new TravelCustomer("강호동", 11, 50);
		TravelCustomer customerWhang = new TravelCustomer("황길동", 50, 100);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerKang);
		customerList.add(customerWhang);
		
		System.out.println("=== 고객 명단 추가된 순서대로 출력 ===");
		//고객의 명단 출력
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("");
		//여행의 총 비용 계산
		int total =customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + total + "입니다");
		
		System.out.println("");
		//20세 이상인 사람의 이름 정렬
		System.out.println("=== 20세 이상 고객 명단 정렬하여 출력 ===");
		customerList.stream().filter(c->c.getAge() >= 20).map(s-> s.getName()).sorted().forEach(n->System.out.println(n));
	}

}
