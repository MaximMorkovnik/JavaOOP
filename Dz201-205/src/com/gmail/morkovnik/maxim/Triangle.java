/**
 * Создайте классы, которые описывают, как минимум, три
 * геометрические фигуры (они должны быть подклассами
 * Shape). При этом они в качестве свойств должны содержать
 * классы Point.
 */
package com.gmail.morkovnik.maxim;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
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
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	@Override
	public double getPerimetr() {
		return a.setDistance(b) + b.setDistance(c) + c.setDistance(a);
	}

	@Override
	public double getArea() {
		double al = a.setDistance(b);
		double bl = b.setDistance(c);
		double cl = c.setDistance(a);
		double p = this.getPerimetr() / 2.0;
		return Math.sqrt(p * (p - al) * (p - bl) * (p - cl));
	}
}
