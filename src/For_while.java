
public class For_while {
	public static void main(String[] args) {

//		int dan = 2;
//		int count = 1;
//		
//		for (dan = 2; dan <= 9; dan++) {
//			System.out.println(dan + "단");
//		 for (count = 1; count < 10; count++) {
//			System.out.println(dan + "X" + count+ "=" + dan * count);	
//		}
//		System.out.println();
//		}
		// 사칙연산
		String operator = "-";
		int num = 10;
		int num2 = 5;
		
		int result = 0;
		
		if (operator == "+") {
				result = num + num2;
		} else if (operator == "-") {
				result = num - num2;
		} else if (operator == "*") {
				result = num * num2;
		} else if (operator == "/") {
				result = num / num2;
		} else{
				System.out.println("연산자 오류입니다");
				return;
		}
		System.out.println("결과 값은 " + result + "입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
