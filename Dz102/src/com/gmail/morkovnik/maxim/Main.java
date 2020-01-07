/**
 * Описать класс «Triangle». В качестве свойств возьмите длины сторон
 * треугольника. Реализуйте метод, который будет возвращать площадь этого
 * треугольника. Создайте несколько объектов этого класса и протестируйте их.
 */
package com.gmail.morkovnik.maxim;

public class Main {

	public static void main(String[] args) {

		Triangle tr1 = new Triangle(3, 4, 5);
		Triangle tr2 = new Triangle();
		tr2.setA(2);
		tr2.setB(4);
		tr2.setC(4);

		tr1.getArea();
		tr2.getArea();

		System.out.println(tr1.getArea());
		System.out.println(tr2.toString());
	}
}
