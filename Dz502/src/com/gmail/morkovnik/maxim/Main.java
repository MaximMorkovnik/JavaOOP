/**
 * �������� ���������, ������� ������ �� ���� ���
 * ��������� �����, � ������ ����. ���������� ����� �����
 * ������ ���� �����, ������� ������������ ���� � � ������ �
 * �� ������ �����.
 */
package com.gmail.morkovnik.maxim;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		TextService.saveEqualsWords(new File("a.txt"), new File("b.txt"), new File("c.txt"));
	}
}
