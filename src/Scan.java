import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		// next�� nextLine�� ���� ����
		int age = 0;
		String name = "";
		String x,y = "";
	
		System.out.print("���̸� �Է� �ϼ��� : ");
		age = k.nextInt();
		System.out.print("�̸��� �Է� �ϼ��� : ");
		name = k.next();
		System.out.printf("���� : %d �̸� : %s", age, name);
		System.out.println();

		System.out.print("a b c d �Է� : ");
		x = k.next();	// next�� ��������� ���
		y = k.nextLine();	// nextLine�� ������� ���� �� �� ��ü�� ���
		System.out.printf("x = %s\ny = %s", x, y);
		
		k.close();
		
		
		
		
		
		
	
	}
}
