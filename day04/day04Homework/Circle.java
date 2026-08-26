package day04Homework;

public class Circle { // 상수 및 필드 정의
	public static final double PI = 3.14;
	private double radius;
	
	//생성자
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//원의 면적 계산 PI * (r의 제곱)
	public double getArea() {
		return PI * radius * radius;
	}
	// Getter & Setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
