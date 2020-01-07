package com.gmail.morkovnik.maxim;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cat cat1 = new Cat("D", 2);
		Cat cat2 = new Cat("C", 1);
		Cat cat3 = new Cat("B", 5);
		Cat cat4 = new Cat("A", 7);
		Cat cat5 = new Cat("E", 9);

		Cat[] catArray = { cat1, null, cat2, null, cat3, cat4, cat5 };

		for (Cat cat : catArray) {
			System.out.println(cat);
		}

		int parametr = 0;
		System.out.println("Input parametr");
		parametr = sc.nextInt();

		if (parametr == 1) {
			Arrays.sort(catArray, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
					: a.getAge() - b.getAge());
		}

		if (parametr == 2) {
			Arrays.sort(catArray, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
					: a.getName().compareTo(b.getName()));
		}
		System.out.println();

		for (Cat cat : catArray) {
			System.out.println(cat);
		}
		sc.close();
	}
}
