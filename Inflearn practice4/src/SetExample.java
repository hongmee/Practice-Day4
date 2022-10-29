import java.util.HashSet;
import java.util.Set;

public class SetExample {

	//리스트 : 순서가 있고, 중복값을 허용한다
	// 셋 : 순서가 없고, 중복값을 허용하지 않는다. 순서가 없기 때문에 특정 위치에 접근할 수 없다
	
	public static void main(String[] args) {
		Set<String> myFavoriteFoods = new HashSet<>();
		
		myFavoriteFoods.add("치킨");
		myFavoriteFoods.add("피자");
		myFavoriteFoods.add("치킨");
		
		myFavoriteFoods.remove("치킨");
		
		System.out.println(myFavoriteFoods);
	}
	
}
