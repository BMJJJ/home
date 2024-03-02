package home;

//while문과 scanner를 이용해서 키보드로부터 입력된 데이터로 예금,출금,조회
//종료 기능을 제공하는 코드를 작성해보세요. 프로그램 실행시키면 다음과 같은 결과가 나와야 합니다.
import java.util.Scanner;

public class Home12 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0,select, minus=0; 
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("=============");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료|");
			System.out.println("=============");
			System.out.println("선택>");
			select = scanner.nextInt();
			
			switch(select) {
				case 1:
					System.out.println("예금액>");
					balance += scanner.nextInt();
					break;
				case 2:
					System.out.println("출금액>");
					minus = scanner.nextInt();
					if(balance >= minus) balance -= minus;
					else 
						System.out.println("잔고가 부족합니다");
					break;
				case 3:
						System.out.println("잔고>"+ balance);
						break;
			  case 4:
							System.out.println("종료>");
							run =false;
							break;
							default:
								System.out.println("입력이 잘못되었습니다.다시 입력하세요");
			}			
		}		
		scanner.close();
	}
}
