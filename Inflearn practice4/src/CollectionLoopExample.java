import java.util.ArrayList;
import java.util.List;

public class CollectionLoopExample {

	
	public static void main(String[] args) {
		List<String> foods = new ArrayList<>();
		
		
		foods.add("치킨");
		foods.add("피자");
		foods.add("고구마말랭이");
		
		for(String food : foods) {
			System.out.println(food+" 맛있어요");
		}
		
		
		if(foods.isEmpty()) {
			System.out.println("목록이 비어있습니다");
		}else {
			System.out.println("총"+foods.size()+"개의 음식이 있습니다");
		}
		
	}
}
