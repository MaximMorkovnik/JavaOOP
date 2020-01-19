/*
 * Создайте сто потоков, которые будут вычислять факториал
 * числа, равного номеру этого потока, и выводить результат на экран.
 */
package com.gmail.morkovnik.maxim;

public class Main {

	public static void main(String[] args) {

		Factorial[] tasks = new Factorial[100];
		Thread[] threads = new Thread[100];

		for (int i = 1; i <= 100; i++) {
			tasks[i - 1] = new Factorial(i);
			threads[i - 1] = new Thread(tasks[i - 1], "task " + i);
			threads[i - 1].start();
		}
	}
}
