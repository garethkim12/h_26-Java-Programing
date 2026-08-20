package start;

import java.util.Scanner;

public class ifQuiz {

	public static void main(String[] args) {
		try(// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)){
			System.out.print("세 개의 숫자를 입력하십시오: ");
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			int max = a;
			if (max < b) {
			max = b;
			}
			if (max < c) {
			max = c;
			}
			System.out.print("가장 큰 수는 " + max + " 입니다." );
		}
	}

}
