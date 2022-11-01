import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class MapSetExample {

	
	public static void main(String[] args) {
		
		Map<String, String> dictionary = new HashMap<>();
		
		dictionary.put("cat", "고양잉");
		dictionary.put("ham", "햄스터");
		
		if(dictionary.isEmpty()) {
			System.out.println("사전에 단어가 없습니다");
			System.exit(0);
		}else {
			System.out.println("사전에 단어가 "+dictionary.size()+"개 있습니다");
		}
	
		Scanner scan = new Scanner(System.in);
		String eng = scan.nextLine();
		String kor = dictionary.get(eng);
		
		if(kor == null) {
			System.out.println("사전에 없는 단어입니다");
		}else {
			System.out.println(eng+"의 뜻은 "+kor+"입니다");
		}
		
		Set<Entry<String, String>> entries = dictionary.entrySet(); //키-값 쌍 하나를 반환
		
		
		
		for(Map.Entry<String, String> entry : entries) {
			String english = entry.getKey();
			String korean = entry.getValue();
			
			System.out.println(english + " : "+ korean);
		}
		
	}
}
