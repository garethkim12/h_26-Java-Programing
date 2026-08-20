package start;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);	
		int a  = sc.nextInt();
		if(a % 2 == 0) {
		a = 1;	
		}
		else {
		a = 2;	
		}
		switch(a) {
			case 1:
				System.out.println("짝수 입니다.");
				break;
			case 2:
				System.out.println("홀수 입니다.");
				break;		
			default:
				System.out.println("잘못입력하셨습니다.");
		}
	}

}
