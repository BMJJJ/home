package home;
/*while문과Math.random()메소드를 이용해서 두개의 주사위를 던졌을때 나오는 눈을 (눈1,눈2)형태로 출력하고,
눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성하세요. 
눈의 합이 5가 되는 조합ㅇ느 (1,4),(4,1),(3,2)입니다.
*/

public class Home11 {
	public static void main(String[] args) {
	 int num1,num2;
	 System.out.println("2개의 주사위를 던집니다. 두 주사위의 합이 5가 될때 까지 출력합니다");
	
	 while(true) {
		num1 = (int)(Math.random()*6)+1;
		num2 = (int)(Math.random()*6)+1;
		System.out.println(""+num1+","+num2+"");
		
		if(num1+num2 ==5) break; System.out.println();
	}
	
 }
}
