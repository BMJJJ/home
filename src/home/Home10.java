package home;
//for문을 이용해서 1부터100까지의 정수중 3의 배수의 합을 구하시오.
public class Home10 {
	public static void main(String[] args) {
		
	int tot =0;
	
	for(int i = 0; i <= 100; i++) {
		if(i % 3 ==0) {
		 tot = tot +i;
		}
	}
	System.out.println("3의 배수의 총합은 " + tot +" 입니다." );
	
	}
}
