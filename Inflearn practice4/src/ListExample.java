import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {
		/* List<String> list = new ArrayList<>();
		list.add("치킨");
		list.add("탕수육");
		list.add("마라탕");
		list.add("피자");
		
		list.remove(1);
		
		list.set(0, "피자");
		
		boolean contains = list.contains("순대");
		
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(contains);
		
		//리스트 : 요소를 마음대로 추가/제거, 메소드 제공, 중복값 허용  */
		
	/*	System.out.println("저장할 음식의 이름을 입력하세요(종료: 0 입력)");
		
		List<String> foods = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String food = scanner.nextLine();
			
			if(food.equals("0")) {
				break;
			}
			
			if(foods.contains(food)) {
				System.out.println("이미 목록에 있습니다");
			}else {
				foods.add(food);
			}
		}
		
		
		Collections.sort(foods); //오름차순 정렬 
		Collections.reverse(foods); //내림차순 정렬
		Collections.shuffle(foods); //무작위 섞기
		
		System.out.println(foods.get(0)); */
		
		
		List<String> names = Arrays.asList("정동원","장민호","임영웅","이찬원"); 
		
		System.out.println(names);
		
		
		
	}
	
}
