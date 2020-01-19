/**
 * Напишите программу, которая скопирует файлы с заранее
 * определенным расширением(например, только doc) из
 * каталога источника в каталог приемник.
 */
package com.gmail.morkovnik.maxim;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void copyFile(File in, File out) throws IOException {
		if (in == null || out == null) {
			throw new IllegalArgumentException("Null file pointer"); // проверили коректность входных параметров
		}
		try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {

			byte[] buffer = new byte[1024 * 1024];
			int readByte = 0;

			for (; (readByte = is.read(buffer)) > 0;) {
				os.write(buffer, 0, readByte);
			}

		} catch (IOException e) {
			throw e;
		}
	}

	public static void copyFolder(File folderIn, File folderOut, FileFilter ffilt) throws IOException {
		if (folderIn == null || folderOut == null || ffilt == null) {
			throw new IllegalArgumentException("null file pointer");
		}

		File[] files = folderIn.listFiles(ffilt);
		for (File file : files) {
			copyFile(file, new File(folderOut, file.getName()));
		}
		
	}
}
