/*
 * Написать метод, который создаст список, положит в него 10
 * элементов, затем удалит первые два и последний, а затем выведет результат на экран.
 */
package com.gmail.morkovnik.maxim;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		fillList(list);
		System.out.println(list);
		modificationList(list);
		System.out.println(list);
	}

	public static void fillList(List<Integer> list) {
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 15));
		}
	}

	public static void modificationList(List<Integer> list) {
		list.remove(0);
		list.remove(0);
		list.remove(list.size() - 1);
	}
}