package day04Homework;

public class OverridingTest {
    public static void main(String[] args) {
    	// 원의  반지름 / 면적
    	Circle circle = new Circle(5.0); 
        System.out.println(">>> 원 : ");
        System.out.println("반지름 : " + circle.getRadius());
        System.out.println("면적 : " + circle.getArea());
        // 공의  반지름 / 면적
        Ball ball = new Ball(5.0);
        System.out.println("\n>>> 공 : ");
        System.out.println("반지름 : " + ball.getRadius());
        System.out.println("면적 : " + ball.getArea());
        // 원기둥의 반지름 / 높이 / 면적
        Cylinder cyl = new Cylinder(5.0, 7.0);
        System.out.println("\n>>> 원기둥 : ");
        System.out.println("반지름 : " + cyl.getRadius());
        System.out.println("높이 : " + cyl.getHeight());
        System.out.println("면적 : " + cyl.getArea());
    }
}