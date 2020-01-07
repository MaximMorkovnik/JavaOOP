/**
 * Напишите программу, которая примет на вход два
 * текстовых файла, а вернет один. Содержимым этого файла
 * должны быть слова, которые одновременно есть и в первом и
 * во втором файле.
 */
package com.gmail.morkovnik.maxim;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		TextService.saveEqualsWords(new File("a.txt"), new File("b.txt"), new File("c.txt"));
	}
}
