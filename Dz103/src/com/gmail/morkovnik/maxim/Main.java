/**
 * Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
 * декартовой системе координат). В качестве свойств этого класса возьмите
 * координаты вектора. Для этого класса реализовать методы сложения, скалярного и
 * векторного произведения векторов. Создайте несколько объектов этого класса и
 * протестируйте их.
 */
package com.gmail.morkovnik.maxim;

public class Main {

	public static void main(String[] args) {

		Vector3d v1 = new Vector3d(2, 3, 5);
		Vector3d v2 = new Vector3d(4, -3, 2);
		Vector3d v3 = new Vector3d(2, 1, 7);
		Vector3d v4 = new Vector3d();

		Vector3d vAdd12 = v1.addVec(v2);
		Vector3d vAdd21 = v2.addVec(v1);
		double scalPro12 = v1.scalarPro(v2);
		double scalPro13 = v1.scalarPro(v3);
		Vector3d vV21 = v2.vecPro(v1);
		Vector3d vV23 = v2.vecPro(v3);
		Vector3d vV32 = v3.vecPro(v2);
		double scalPro44 = v4.scalarPro(v4);
		Vector3d vVc44 = v4.vecPro(v4);

		System.out.println("vector1: " + v1.toString());
		System.out.println("vector2: " + v2.toString());
		System.out.println("vector3: " + v3.toString());
		System.out.println("vector4: " + v4.toString());
		System.out.println("v1 + v2: " + vAdd12.toString());
		System.out.println("v2 + v1: " + vAdd21.toString());
		System.out.println("scalarProduct(v1, v2) = " + scalPro12);
		System.out.println("vectorProduct(v2, v1): " + vV21.toString());
		System.out.println("scalarProduct(v1, v3) = " + scalPro13);
		System.out.println("vectorProduct(v2, v3): " + vV23.toString());
		System.out.println("vectorProduct(v3, v2): " + vV32.toString());
		System.out.println("scalarProduct(v4, v4) = " + scalPro44);
		System.out.println("vectorProduct(v4, v4): " + vVc44.toString());
	}
}
