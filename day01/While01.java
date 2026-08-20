package start;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
	     System.out.println("숫자를 입력하시오 (0 입력시 종료):");
	     int sum = 0;
	     int num;
	     while ((num = sc.nextInt()) != 0) {
	             sum += num;
	            }
	            System.out.print("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
		 }
	}
}