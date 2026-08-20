package start;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		try(// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in)) {
			System.out.print("원의 반지름을 입력하시오(cm):");
			double a = sc.nextDouble();
			double pi = 3.14;
			System.out.print("원의 넓이는 " + (a*a*pi) + "cm 입니다");
		}
	}

}
