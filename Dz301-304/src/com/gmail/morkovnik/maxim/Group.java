package com.gmail.morkovnik.maxim;

public class Group {

	private Student[] s = new Student[10];
	private int num;

	public Group() {
		super();
	}

	public Group(int num) {
		super();
		this.num = num;
	}

	public Student[] getS() {
		return s;
	}

	public void setS(Student[] s) {
		this.s = s;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void addStudent(Student a) throws MyException {
		try {
			if (num >= s.length) {
				throw new MyException();
			}
			for (int i = 0; i < s.length; i++) {
				if (s[i] == null) {
					s[i] = a;
					System.out.println("Student added ");
					num++;
					break;
				}
			}
		} catch (MyException e) {
			System.out.println(e);
		}
	}

	public Student searchStudent(String surName) {
		for (Student student : s) {
			if (student != null && student.getSurname().equals(surName)) {
				return student;
			}
		}
		return null;
	}

	public void deleteStudent(Student a) {
		try {
			for (int i = 0; i < s.length; i++) {
				if (s[i].equals(a)) {
					s[i] = null;
					System.out.println("Student deleted ");
					num--;
					break;
				}
			}
		} catch (NullPointerException e) {
		}
	}

	private void sort() {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (compareStudent(s[i], s[j]) > 0) {
					Student temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
	}

	private int compareStudent(Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getSurname().compareTo(b.getSurname());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group: " + this.num).append(System.lineSeparator());
		int i = 0;
		sort();
		for (Student student : s) {
			if (student != null) {
				sb.append((++i) + ") ").append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}
}
