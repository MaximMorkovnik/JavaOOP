/**
 * Создайте классы, которые описывают, как минимум, три
 * геометрические фигуры (они должны быть подклассами
 * Shape). При этом они в качестве свойств должны содержать
 * классы Point.
 */
package com.gmail.morkovnik.maxim;

public class Circle extends Shape {
	private Point a;
	private Point b;

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Circle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public double getPerimetr() {
		return Math.PI * 2 * a.setDistance(b);
	}

	@Override
	public double getArea() {
		return Math.PI * a.setDistance(b) * a.setDistance(b);
	}
	
	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}
}
