/*
 * Реализуйте программу многопоточного копирования файла
 * блоками с выводом прогресса на экран.
 */
package com.gmail.morkovnik.maxim;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		FileCopier copier = new FileCopier("a.txt", "acopy.txt");
		try {
			copier.copy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
