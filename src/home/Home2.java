package home;

/*두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되,
 * 이때 5개항씩 그 결과를 출력시켜주시오.
 * (마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
 * 여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 
 * 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
 */
import java.util.Scanner;

public class Home2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 , i2 ,  tot=0;
		
		System.out.println("수를 입력하시오" ); i1=sc.nextInt();
		System.out.println("수를 입력하시오" ); i2=sc.nextInt();
		
		while(i1 < i2 || i1 > i2) {
		
			i1 = i1 + 1;
			tot = tot +(i1-1);
			
			
			if((i1 % 5) == 0) System.out.println( "두 숫자 "+i1+" 와 "+i2+" 사이 5항씩의  합은"+tot+"입니다 .");
		}
			
		sc.close();	
		}
		
		
		
		
		
	}


