package start;

import java.util.Scanner;

public class charge {

	public static void main(String[] args) {
		try(// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in)){
			System.out.print("금액:");
			int a = sc.nextInt();
			int b = a / 500, c = (a % 500) / 100;
			System.out.println("동전의 수 >");
			System.out.println("500원 짜리:" + b + "개");
			System.out.print("100원 짜리:" + c + "개");
		}
  }
}
