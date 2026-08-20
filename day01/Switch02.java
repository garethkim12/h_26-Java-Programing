package start;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("등급을입력하세요: ");
		char grade = input.nextLine().charAt(0);
		char upper = Character.toUpperCase(grade);
		if(upper == 'A') {
		System.out.print(">>아주 열심히 하셨군요~~~!!");
		}
		if(upper == 'B') {
		System.out.print(">>아주 열심히 하셨군요~~~!!");
		}
		if(upper == 'C') {
		System.out.print(">>남들만큼 하셨네요~~~");
		}
		if(upper == 'D') {
		System.out.print(">>조금 더 노력이 필요합니다");
		}
		if(upper == 'F') {
		System.out.print(">>교수실로 찾아오세요");
		}		
	}
}