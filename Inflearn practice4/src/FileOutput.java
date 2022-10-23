import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {

	public static void main(String[] args) {
			FileWriter writer = null;
		
			try {
			writer = new FileWriter("src/output01.txt",true);
		} catch (IOException e) {
			/* e.printStackTrace(); <--에러를 표시해준다는 뜻 */
			System.out.println("파일 생성에 실패했습니다 ㅠㅠ");
			System.exit(1); // <--0으로 끝나면 프로그램이 정상적으로 종료됐다는 뜻 
		}
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("아무말이나 써보세용. \n *종료하려면 입력 없이 엔터");
			
			while(true) {
			
			String input = scanner.nextLine();		
			
			if(input.equals("")) {
				System.out.println("파일 입력을 종료합니다");
				break;
			}
			
			try {
				writer.write(input+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 데이터 쓰기에 실패했습니다 ㅠㅠ");
				System.exit(2);
			}
			
			}
			
			
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 닫기에 실패했습니다 ㅜㅜ");
			}	
			
			
			
	}
	
}
