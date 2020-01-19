/**
 * Создайте класс, описывающий человека (создайте метод,
 * выводящий информацию о человеке).
 */
package com.gmail.morkovnik.maxim;

public class Main {

	public static void main(String[] args) {

		Group g1 = new Group();
		Student s1 = new Student(18, "C", "Serg", 1);
		Student s2 = new Student(19, "B", "Max", 2);
		Student s3 = new Student(20, "M", "Michael", 3);
		Student s4 = new Student(21, "D", "Vadim", 4);
		Student s5 = new Student(22, "S", "Vlad", 5);
		Student s6 = new Student(23, "F", "Serg", 6);
		Student s7 = new Student(24, "G", "Max", 7);
		Student s8 = new Student(25, "H", "Michael", 8);
		Student s9 = new Student(26, "L", "Vadim", 9);
		Student s10 = new Student(27, "A", "Vlad", 10);
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
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();
		System.out.println(g1);
		g1.deleteStudent(s3);
		System.out.println();
		System.out.println(g1.searchStudent("D"));
	}
}
