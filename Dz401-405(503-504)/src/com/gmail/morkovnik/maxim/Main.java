/**
 * 1. Усовершенствуйте класс Group, добавив возможность
 * интерактивного добавления объекта.
 * 2. Реализуйте возможность сортировки списка студентов
 * по фамилии.
 * 3. Реализуйте возможность сортировки по параметру
 * (Фамилия, успеваемость и т. д.).
 * 4. Реализуйте интерфейс Военком, который вернет из группы
 * массив студентов - юношей, которым больше 18 лет.
 * 5. Протестируйте его работу.
 */
package com.gmail.morkovnik.maxim;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		Group g1 = new Group("101");
		Student s1 = new Student(15, "C", "Serg", 1, 1256);
		Student s2 = new Student(16, "B", "Max", 2, 2574);
		Student s3 = new Student(17, "M", "Michael", 3, 2441);
		Student s4 = new Student(18, "D", "Vadim", 4, 2001);
		Student s5 = new Student(19, "S", "Vlad", 5, 1965);
		Student s6 = new Student(20, "F", "Serg", 6, 1100);
		Student s7 = new Student(21, "G", "Max", 7, 3001);
		Student s8 = new Student(22, "H", "Michael", 8, 2369);
		Student s9 = new Student(23, "L", "Vadim", 9, 2555);
		Student s10 = new Student(24, "A", "Vlad", 10, 1001);
		try {
			g1.addStudent(s1);
			g1.addStudent(s2);
			g1.addStudent(s3);
			g1.addStudent(s4);
			g1.addStudent(s5);
			g1.addStudent(s6);
			g1.addStudent(s7);
			g1.addStudent(s8);
			g1.addStudent(s9);
			g1.addStudent(s10);
			System.out.println();
			System.out.println(g1);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		g1.deleteStudent(3);

		System.out.println(g1.searchStudent("D") + " found by surname." + '\n');

		Student[] recruterArray = g1.getRecruter();
		for (Student student : recruterArray) {
			System.out.println("Students over 18 - " + student);
		}
		System.out.println();
		g1.sortByParametr(4, false);

		try {
			g1.printGroupToFile("M:\\GroupFolder");
			Group g2FromFile = Group.readGroupFromFile("M:\\GroupFolder/group.txt");
			g2FromFile.addStudentInteractive();
			System.out.println(g2FromFile);
		} catch (IOException | MyException e) {
			System.out.println(e);
		}
	}
}
