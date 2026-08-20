package start;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하시오.");
	int a = sc.nextInt();
	System.out.println("[구구단" + a + "단]");
	for(int i=1; i<a+1; i++) {
		System.out.println(a + " x " + i + "=" + (a * i));
		}
	}

}
