package day04Homework;

public class Ball extends Circle{
	public Ball(double radius) {
		super(radius);
	}
	// 구의 겉넓이 재정의 (Overriding): 4 *3.14* r * r
	@Override
	public double getArea() {
		return 4 * Circle.PI * getRadius() * getRadius();
	}
}
