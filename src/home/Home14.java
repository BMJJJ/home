package home;

//다이아몬드 모양 만들기 (홀수를 입력받기)
import java.util.Scanner;

public class Home14 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("숫자를 입력하세요.(홀수) ");
			num =sc.nextInt();
			if(num%2==0) {
				System.out.println("홀수를 입력하세요");
			}
				else break;
		}
		//위쪽
			for(int i=1; i<=num; i+=2) {
				for(int j=1; j<=(num-i)/2; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=num-2; i>=1; i-=2) {
				for(int j=1; j<=(num-i)/2; j++) {
					System.out.print(" ");
				}
				for(int j =1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		
		
		
		sc.close();
	}
}
