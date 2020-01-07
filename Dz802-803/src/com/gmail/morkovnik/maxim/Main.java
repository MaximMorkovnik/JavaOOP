/*
 * 2) Создайте класс-контейнер типа стек (класс в который можно добавлять и удалять объекты других классов, только в вершину стека), в который
 * можно сохранять объекты произвольного типа. Должен быть метод добавления элемента в стек, получение с удалением элемента из стека, и
 * просто получение элемента из вершины из стека. Должна быть реализована работа с «черным списком» классов (смотри ниже). Если
 * объект который добавляется в стек принадлежит классу из «черного списка», то добавление такого объекта запрещено.
 * 3) Для описанного выше стека создайте класс «Черный список», в котором будут описаны классы объектов которые нельзя добавлять в стек.
 * Должна быть возможность добавления классов в черный список, проверка объекта на то, что класс, к которому он принадлежит, принадлежит или не
 * принадлежит к классам в черном списке.
 */
package com.gmail.morkovnik.maxim;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Stack stack = new Stack();
		BlackList bl = new BlackList();
		bl.addClassToList(Integer.class);
		stack.setBlackList(bl);
		stack.addElement(new File("a.txt"));
		stack.addElement(new Scanner(System.in));
		stack.addElement(new BigInteger("99999"));
		stack.addElement(new Integer("100"));
		stack.addElement(12345);
		stack.addElement(true);

		System.out.println(stack);

		for (; stack.getLastElement() != null;) {
			System.out.println(stack.getLastElementAndDel());
		}

		System.out.println();
		System.out.println(stack.getLastElementAndDel());
	}
}