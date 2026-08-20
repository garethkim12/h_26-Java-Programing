package start;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("변수 a 에 넣을 숫자 입력: "); // 입력 받고자 하는 창 출력
			int a = sc.nextInt();
			System.out.print("변수 b 에 넣을 숫자 입력: "); // 입력 받고자 하는 창 출력
			int b = sc.nextInt();
			int temp = a;
			a = b;
			b = temp;
			System.out.println("변수 a의 값 =" + a );
			System.out.print("변수 b의 값 =" + b );
		}
		
	}

}
