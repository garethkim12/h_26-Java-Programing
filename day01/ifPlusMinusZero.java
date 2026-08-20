package start;

import java.util.Scanner;

public class ifPlusMinusZero {

	public static void main(String[] args) {
		try(// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in)){
			System.out.print("숫자를 입력하세요:");
			int a = sc.nextInt();
			if(a > 0) {
				System.out.print(">>양수입니다.");
			}
			if(a < 0) {
				System.out.print(">>음수입니다.");
			}
			if(a == 0){
				System.out.print(">>0입니다.");
			}
		}
	}

}
