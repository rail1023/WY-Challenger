import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		// next와 nextLine의 차이 예제
		int age = 0;
		String name = "";
		String x,y = "";
	
		System.out.print("나이를 입력 하세요 : ");
		age = k.nextInt();
		System.out.print("이름을 입력 하세요 : ");
		name = k.next();
		System.out.printf("나이 : %d 이름 : %s", age, name);
		System.out.println();

		System.out.print("a b c d 입력 : ");
		x = k.next();	// next는 공백까지만 출력
		y = k.nextLine();	// nextLine은 공백까지 포함 한 줄 전체를 출력
		System.out.printf("x = %s\ny = %s", x, y);
		
		k.close();
		
		
		
		
		
		
	
	}
}
