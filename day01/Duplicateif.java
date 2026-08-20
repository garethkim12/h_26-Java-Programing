package start;

import java.util.Scanner;

public class Duplicateif {

	public static void main(String[] args) {
		try(// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in)){
		System.out.print("숫자를 입력하세요: ");
		int a = sc.nextInt();
		if(a >= 0) {
			if(a % 2 == 0) {
			System.out.print("짝수입니다");
			}
			if(a % 2 != 0) {
			System.out.print("홀수입니다");
		    }
				   }
		else {
			System.out.print("양수가 아닙니다");
			 }
		
  }
 }

}
