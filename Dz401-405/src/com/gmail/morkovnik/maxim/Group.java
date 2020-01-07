package com.gmail.morkovnik.maxim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Group implements Voencom {

	private Student[] s = new Student[10];
	private String groupName;

	public Group() {
		super();
	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public Student[] getS() {
		return s;
	}

	public void setS(Student[] s) {
		this.s = s;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student a) throws MyException {
		if (a.getGroup() == null) { // ��������� �� ������ �� ���� ������� ��� � �����-�� ������
			boolean isAdd = false; // ������� �� �������� �������?
			for (int i = 0; i < s.length; i++) {
				if (s[i] == null) { // ���� ����� � ������ ��������
					s[i] = a; // ��������� �� ��������� �����
					a.setGroup(this); // ��������� ��� ������� ������ ������ � ���� ������
					System.out.println("Student " + a.getSurname() + " is added to the group: " + groupName);
					isAdd = true;
					break;
				}
			}
			try {
				if (!isAdd) {
					throw new MyException(); // ���� ������ �� ��������, ��� ��� ��� �����
				}
			} catch (MyException e) {
				System.out.println("The group is full ");
			}
			// ���� ���� ������� ��� ���� � ������� ������
		} else
			System.out.println(
					"Student " + a.getSurname() + " already studying in group: " + a.getGroup().getGroupName());
	}

// throw new IllegalArgumentException("Null student"); // ���������� ��� ��� �� ���������� ��������
// return; // ��������� ������ ������
// throw new MyException(); // ����������� ���������� ��� ������������ � ��������� ���

	public void addStudentInteractive() throws MyException { // ��� �������������� ���������� ��������, ���� �����, ��
																// ���
		// ��������� (�������� �������� � ��������)
		int freePlace = -1; // c��� ������� ����� ���������� �����
		for (int i = 0; i < s.length; i++) { // ���� ���� �� ��������� �����
			if (s[i] == null) { // ���� ����� � ������ ��������
				freePlace = i;
				System.out.println("Free place was found in group " + groupName + ". Please enter student info ");
				break;
			}
		}
		if (freePlace < 0) { // ���� ����� �� �������
			System.out.println("The group is full");
		} else { // ���� ����� �����
			while (true) { // ��� ������� ������� ���������� �������� ���� ��� ������������ ���� ������
				Student st = new Student();
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try {
					System.out.println("Please enter student surname (String):");
					st.setSurname(reader.readLine());
					System.out.println("Please enter student name (String):");
					st.setName(reader.readLine());
					System.out.println("Please enter student age (int 1-100):");
					st.setAge(Integer.parseInt(reader.readLine()));
					System.out.println("Please enter student course (int 1-10):");
					st.setCourse(Integer.parseInt(reader.readLine()));
					System.out.println("Please enter student progress (int 1-10000):");
					st.setProgress(Integer.parseInt(reader.readLine()));
					s[freePlace] = st; // ��������� �� ��������� �����
					st.setGroup(this); // ��������� ��� ������� ������ ������ � ���� ������
					System.out.println("Student " + st.getSurname() + " is added to the group: " + groupName);
					break;
				} catch (Exception e) { // ���� ����� ����������� ������ ���������� ����������� ��� ���
					System.out.println("Invalid enter, student is not added, try again? (y / n):");
					try {
						if (reader.readLine().equals("y")) {
							System.out.println("Please enter student data:");
						} else { // ��� ����� ����� �������� �� "y" ����������� ������� �������� ��������
							break;
						}
					} catch (Exception x) { // ����� ���� ����� ����������, �� reader.readLine() ��������� ������� ������
											// ����������
						System.out.println("Invalid enter");
						break;
					}
				}
			}
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

	public void deleteStudent(int course) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null && s[i].getCourse() == course) {
				Student st = s[i];
				s[i] = null;
				System.out.println(st.toString() + " was successfully deleted." + '\n');
				return;
			}
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

	public void sortByParametr(int i) {
		Arrays.sort(this.s, new StudentComparator(i));
	}

	public void sortByParametr(int i, boolean forward) {
		Arrays.sort(this.s, new StudentComparator(i, forward));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group: ").append(System.lineSeparator()); // System.lineSeparator() ���������� ������ �
																// ��������� �������� ������ ("\n" Unix,
																// "\r\n"
																// Windows)
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

	@Override
	public Student[] getRecruter() {
		int n = 0;
		for (Student student : s) {
			if (student != null && student.getAge() >= 18) {
				n += 1;
			}
		}
		Student[] recruterArray = new Student[n]; // n - ���������� ��������� � �������
		int i = 0;
		for (Student student : this.s) {
			if (student != null && student.getAge() >= 18) {
				recruterArray[i++] = student;
			}
		}
		return recruterArray;
	}

	public void printGroupToFile(String resultFolderAdress) throws IOException {
		if (resultFolderAdress == null) {
			throw new IllegalArgumentException("nulPointer");
		}
		File folderResult = new File(resultFolderAdress);
		if (!folderResult.exists()) {
			folderResult.mkdir();
		}

		File fileResult = new File(resultFolderAdress + "/group.txt");

		try {
			fileResult.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

		try (BufferedWriter f = new BufferedWriter(new FileWriter(fileResult))) {
			f.write(groupName + "\n");
			for (Student st : s) {
				if (st != null) {
					f.write(st.printStudentToFile() + "\n");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static Group readGroupFromFile(String fileAdress) throws IOException {
		if (fileAdress == null) {
			throw new IllegalArgumentException("nulPointer");
		}
		int pointerIndex = fileAdress.lastIndexOf(".");
		String ext = fileAdress.substring(pointerIndex + 1);

		File groupFile = new File(fileAdress);
		if (!groupFile.exists() || !groupFile.isFile() || !ext.equals("txt")) {
			throw new IllegalArgumentException("file not exists or is not file or not group");
		}
		Group groupFromFile = new Group();
		boolean groupNameInitialise = false;

		try (BufferedReader f = new BufferedReader(new FileReader(groupFile))) {
			for (String str = ""; (str = f.readLine()) != null;) {
				if (!groupNameInitialise) {
					groupFromFile.setGroupName(str);
					groupNameInitialise = true;
					continue;
				}
				String[] s = str.split(";");
				String surname = s[0];
				String name = s[1];
				int age = Integer.parseInt(s[2]);
				int course = Integer.parseInt(s[3]);
				int progress = Integer.parseInt(s[4]);

				groupFromFile.addStudent(new Student(age, surname, name, course, progress));
			}
		} catch (IOException | MyException e) {
			System.out.println("ERROR");
		}
		return groupFromFile;
	}
}
