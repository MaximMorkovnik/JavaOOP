/**
 * Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
 * Наделить его свойствами и методами. Создать несколько экземпляров объектов
 * этого класса. Использовать эти объекты.
 */
package com.gmail.morkovnik.maxim;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Мурчик", "британец", "голубой", 7, true);
		Cat cat2 = new Cat();
		cat2.setName("Бро");
		cat2.setType("манчкин");
		cat2.setEyeColor("зелёный");
		cat2.setWeight(3);
		cat2.setHunger(false);

		System.out.println(cat1.toString());
		System.out.println(cat2.toString());

		System.out.println(cat1.eat());
		System.out.println(cat2.eat());
	}
}
