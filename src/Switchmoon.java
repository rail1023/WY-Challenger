import java.util.Scanner;

public class Switchmoon {
	public static void main(String[] args) {
		String q = "���� �ٸ� ������?\n"
					+ "1. 6\n"
					+ "2. 8\n"
					+ "3. 10\n"
					+ "4. 12\n";
		
		Scanner k = new Scanner(System.in);
		int choice = 0;
		System.out.println(q);
		choice = k.nextInt();
		
		switch (choice) {
		case 1: System.out.println("����");			
			break;
		case 2: System.out.println("����");			
		break;
		case 3: System.out.println("����");			
		break;
		case 4: System.out.println("����");			
		break;
		default: System.out.println("����! : 1~4�� �߿��� ����ּ���");
		}
		
		k.close();
	}
}
