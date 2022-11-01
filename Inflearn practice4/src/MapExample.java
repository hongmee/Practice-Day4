import java.rmi.Remote;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicDesktopIconUI;

// 리스트나 셋과같은 콜렉션 이지만 키와 값을 가지고 있음


public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> dictionary = new HashMap<>();
		
		dictionary.put("chicken","닭");
		dictionary.put("hippo", "하마");

		System.out.println(dictionary);
		
		System.out.println(dictionary.get("chicken"));
		dictionary.put("chicken", null); //값을 제거했으나 개수는 줄어들지 않음
		dictionary.remove("chicken");
		dictionary.remove("hippo");
	
		if(dictionary.isEmpty()) {
			System.out.println("사전에 단어가 없습니다");
			System.exit(0); //프로그램 종료
		}else {
			System.out.println("사전에 "+dictionary.size()+"개의 단어가 있습니다");

		}
		
		
	
		
		Scanner scanner = new Scanner(System.in);
		String english = scanner.nextLine();
		
		String korean = dictionary.get(english);
		
		if(korean == null) {
			System.out.println("사전에 존재하지 않는 단어입니다");
		}else {
			System.out.println(english+"는 "+korean+" 입니다.");
		}
		
		
		
		
		
	}
	
}
