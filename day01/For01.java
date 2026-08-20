package start;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오:");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < a + 1; i++) {
		sum += i;
		};
		System.out.print("1부터" + a + "까지의 합은" + sum + "입니다.");
	}
}


