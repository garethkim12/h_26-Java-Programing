package start;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하시오.");
	int a = sc.nextInt();
	int sum = 1;
	for(int i=0; i<a; i++) {
		sum *= a-i;
		}
	System.out.println(a + "! = " + sum);
	}

}
