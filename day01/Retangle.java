package start;

import java.util.Scanner;

public class Retangle {
	   public static void main(String[] args) {

	try (// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in)) {
		System.out.print("직사각형 가로 길이: "); // 입력 받고자 하는 창 출력
		int a = sc.nextInt();
		System.out.print("직사각형 세로 길이: "); // 입력 받고자 하는 창 출력
		int b = sc.nextInt();
		
		System.out.println("직사각형 넓이는 " + (a*b) + "cm 입니다.");
	}
	}
}
