package com.gmail.morkovnik.maxim;

public class Student extends Human {

	private int course;

	public Student(int age, String surname, String name, int course) {
		super(age, surname, name);
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", getAge()=" + getAge() + ", getSurname()=" + getSurname()
				+ ", getName()=" + getName() + "]";
	}
}
