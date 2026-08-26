package day04Homework;

public class Cylinder extends Circle {
	private double height;

	// 생성자
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	@Override
	public double getArea() {
		double r = getRadius();
		return 2 * Circle.PI * r * r + 2 * Circle.PI * r * height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
