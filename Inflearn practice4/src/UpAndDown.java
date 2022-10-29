import java.util.Scanner;
import java.util.Random;

public class UpAndDown {

	public static int randomNumber;
	public static Scanner scanner = new Scanner(System.in); //멤버변수
	
	
	public static void main(String[] args) {
		Random random = new Random();
		randomNumber = random.nextInt(256);
		
		
		int attempt = 0;
		
		while(attempt < 8) {
			boolean isCorrect = play();
			
			if(isCorrect) {
				break;
			}
			
			attempt = attempt+1 ;
			System.out.println("현재 "+attempt+"회 시도하였습니다"	);
		}
		
		System.out.println("게임을 종료합니다");
	}
	
	
	public static boolean play() {
		System.out.println("숫자를 입력하세요!");
		int input = scanner.nextInt();
		
		if(input == randomNumber) {
			System.out.println("와~ 정답입니다 :)");
			return true;
		} else if(input > randomNumber) {
			System.out.println("정답보다 큰 수입니다");
		} else if(input < randomNumber) {
			System.out.println("정답보다 작은 수입니다");
		}
		return false;
		
	}

}
