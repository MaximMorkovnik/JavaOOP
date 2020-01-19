/**
 * Создайте классы, которые описывают, как минимум, три
 * геометрические фигуры (они должны быть подклассами
 * Shape). При этом они в качестве свойств должны содержать
 * классы Point.
 */
package com.gmail.morkovnik.maxim;

public class Rectangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Rectangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Rectangle() {
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public double getSide(Point a, Point b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}

	public double getPerimetr() {
		return (getSide(a, b) + getSide(a, c)) * 2;
	}

	public double getArea() {
		return getSide(a, b) * getSide(a, c);
	}
}
