import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notepad {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("원하는 작업 번호를 입력해주세요");
			System.out.println("======================");
			System.out.println("1. 메모 읽기");
			System.out.println("2. 새 메모 작성");
			System.out.println("3. 종료하기");
			
			int taskNum;
			
			try {
				String input = scanner.nextLine();
				taskNum = Integer.parseInt(input);
			}catch(NumberFormatException e) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			
			//================파일 읽기
			
			if(taskNum==1) {
				System.out.println("읽을 메모의 파일명을 입력하세요.");
				
				String fileName = scanner.nextLine();
				
				FileInputStream inputStream = null;
				
				try {
					inputStream = new FileInputStream(fileName);
				} catch (FileNotFoundException e) {
					System.out.println("파일이 존재하지 않습니다");
					continue;
				}
						
				System.out.println(fileName+"의 내용을 출력합니다.\n==============");		
				
				Scanner reader = new Scanner(inputStream);
				
				while(reader.hasNextLine()) {
					System.out.println(reader.nextLine());
				}
				System.out.println("\n");
				
				reader.close();
				
			}
			
			
			//=================파일 작성
			
			else if(taskNum==2) {
				System.out.println("저장할 메모의 파일명을 입력하세요");
				
				String fileName = scanner.nextLine();
				
				
				FileWriter writer = null;
				
				try {
					writer = new FileWriter(fileName);
				} catch (IOException e) {
					System.out.println("파일 생성에 실패했습니다");
					continue;
				}
				
				System.out.println("메모할 문자를 입력하세요(*종료는 내용없이 엔터)");
				
				while(true) {
					String input = scanner.nextLine();
					
					if(input.equals("")) {
						System.out.println("메모 작성을 종료합니다.");
						break;
					}
					
					try {
						writer.write(input);
						writer.write("\n");
					} catch (IOException e) {
						System.out.println("내용 작성에 실패했습니다ㅠㅠ");
					}
					
				}
				
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("파일 닫기에 실패했습니다...");
				}
				
			}
			
			// ================파일 종료
			
			else if(taskNum==3) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			else {
				System.out.println("잘못된 입력입니다 :(");
			}
			
		}
		
		
	}
}
