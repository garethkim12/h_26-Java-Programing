package start;
import java.util.Scanner;

public class While02 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("숫자를 입력하세요 : ");
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println(">> 짝수입니다.");
                } else {
                    System.out.println(">> 홀수입니다.");
                }

                System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
                int choice = sc.nextInt();

                if (choice != 1) {
                    break;
                }
            }
        }
    }
}