
public class FunctionExample {

	public static void main(String[] args) {
		sayHello("Janet");
		printSum(3, 5);
		int result = sum(2,5);
		System.out.println(result);
		
		int arrayResult[] = addAndMultiple(3, 7);
		System.out.println(arrayResult[0]);
		System.out.println(arrayResult[1]); 
		
		boolean saidHola = sayHola("안녕");
		
	}
	
	
	public static void sayHello(String name) {
		System.out.println("Hello, "+name+"!");
	}
	
	public static void printSum(int a, int b) {
		System.out.println(a+" + "+b+" = "+sum(a,b));
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	
	public static int[] addAndMultiple(int a, int b) {
		int sum = a+b;
		int multi = a*b;
		
		int[] arrayResult = {sum, multi};
		
		return arrayResult ;
	}
	
	
	public static boolean sayHola(String name) {
		if(name.equals("바보")) {
			System.out.println("바르고 고운 말을 사용해주세요 :(");
			return false;
		}
			System.out.println(name+"님, 안녕하세요 :) !");
			return true;
	}
	
	
}
