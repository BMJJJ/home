package home;
//별 모양 다이아몬드 숫자 입력x 버전
public class Home13 {
		public static void main(String[] args) {
			
			for(int i =1; i<=5; i++) {
				for(int j =1; j<=5-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=(i*2)-1; j++ ) {
					System.out.print("*");
			  }
				for(int j=1; j<5-1; j++) {
					System.out.print(" ");					
				}
				System.out.println();
			}
			for(int i = 1; i <=4; i++) {
				for(int j =1; j<=i; j++) {
					System.out.print(" ");
				}
				for(int j =1; j<=8-(i*2-1); j++) {
					System.out.print("*");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
			
			
		}

}
