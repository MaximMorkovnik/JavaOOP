/**
 * Напишите программу, которая скопирует файлы с заранее
 * определенным расширением(например, только doc) из
 * каталога источника в каталог приемник.
 */
package com.gmail.morkovnik.maxim;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		MyFileFilter ffilt = new MyFileFilter("docx");

		File folderIn = new File("FolderFrom");
		File folderOut = new File("FolderTo");

		try {
			FileCopy.copyFolder(folderIn, folderOut, ffilt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
