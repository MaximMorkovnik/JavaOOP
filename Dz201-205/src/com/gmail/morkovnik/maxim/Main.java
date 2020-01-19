/**
 * Создайте классы, которые описывают, как минимум, три
 * геометрические фигуры (они должны быть подклассами
 * Shape). При этом они в качестве свойств должны содержать
 * классы Point.
 */
package com.gmail.morkovnik.maxim;

public class Main {

	public static void main(String[] args) {

		Point a = new Point(0, 0);
		Point b = new Point(0, 4);
		Point c = new Point(3, 0);

		Triangle aTriangle = new Triangle(a, b, c);
		Circle aCircle = new Circle(a, b);
		Rectangle aRectangle = new Rectangle(a, b, c);

		Board aBoard = new Board();

		aBoard.add(aTriangle, 1);
		aBoard.add(aCircle, 3);
		aBoard.add(aRectangle, 4);
		System.out.println(aBoard);

		aBoard.deleteByIndex(1);

		System.out.println();
		System.out.println(aBoard);
	}
}
