import java.util.Scanner;

public class Switchmoon {
	public static void main(String[] args) {
		String q = "게의 다리 갯수는?\n"
					+ "1. 6\n"
					+ "2. 8\n"
					+ "3. 10\n"
					+ "4. 12\n";
		
		Scanner k = new Scanner(System.in);
		int choice = 0;
		System.out.println(q);
		choice = k.nextInt();
		
		switch (choice) {
		case 1: System.out.println("오답");			
			break;
		case 2: System.out.println("오답");			
		break;
		case 3: System.out.println("정답");			
		break;
		case 4: System.out.println("오답");			
		break;
		default: System.out.println("오류! : 1~4번 중에서 골라주세요");
		}
		
		k.close();
	}
}
