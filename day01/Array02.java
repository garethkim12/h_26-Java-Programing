package start;

import java.util.Scanner;

public class Array02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.print("학생 수 : ");
        int student = sc.nextInt();

        double[] gradeArr = new double[student];  // 학생 수만큼 크기를 정해서 배열 생성

        for (int i = 0; i < student; i++) {
            System.out.print((i + 1) + "번째 학생의 성적 : ");
            gradeArr[i] = sc.nextDouble();          // i번째 자리에 입력값 저장
        }

        for (int i = 0; i < gradeArr.length; i++) {
            sum += gradeArr[i];
        }

        double average = sum / gradeArr.length;

        System.out.println(">> 합계: " + sum);
        System.out.println(">> 평균: " + average);
    }
}