package start;

import java.util.Scanner;

public class intAnswer {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("정수를 입력하세요 :");
			int a = sc.nextInt();
			System.out.print(a % 2 == 0 ? "짝수" : "홀수");
		}
	}

}
