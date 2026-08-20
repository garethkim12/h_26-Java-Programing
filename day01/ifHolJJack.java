package start;

import java.util.Scanner;

public class ifHolJJack {

	public static void main(String[] args) {
		try(// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)){
			System.out.print("숫자를 입력하세요:");
			int a = sc.nextInt();
			if(a % 2 != 0) {
			System.out.print(">> 홀수 입니다. ");
			}
			else {
			System.out.print(">> 짝수 입니다. ");
			}
		}
	}

}
