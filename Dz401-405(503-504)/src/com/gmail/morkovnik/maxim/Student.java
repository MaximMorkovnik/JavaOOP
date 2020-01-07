package com.gmail.morkovnik.maxim;

public class Student extends Human {

	private int course;
	private int progress;
	private Group group;

	public Student(int age, String surname, String name, int course, int progress) {
		super(age, surname, name);
		this.course = course;
		this.progress = progress;
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

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "student [course = " + course + ", progress = " + progress + ", age = " + getAge() + ", surname = "
				+ getSurname() + ", name = " + getName() + "]";
	}

	public String printStudentToFile() {
		return getSurname() + ";" + getName() + ";" + getAge() + ";" + getCourse() + ";" + getProgress();
	}
}
