package com.gmail.morkovnik.maxim;

/**
 * Class representing a stack
 * 
 * @version 0.1 29.11.2019
 * @author maxim.morkovnik
 */
public class Stack {
	private Object[] stackArray = new Object[10];
	private int n = 0;
	private BlackList blackList;

	/**
	 * Default constructor
	 */
	public Stack() {
		super();
	}

	/**
	 * �����������, ����������� ���� BlackList
	 * 
	 * @param blackList <code>BlackList</code>
	 */
	public Stack(BlackList blackList) {
		super();
		this.blackList = blackList;
	}

	/**
	 * �������� ������ blackList
	 * 
	 * @return <code>BlackList</code>
	 */
	public BlackList getBlackList() {
		return blackList;
	}

	/**
	 * ������ ������ blackList
	 * 
	 * @param blackList <code>BlackList</code>
	 */
	public void setBlackList(BlackList blackList) {
		this.blackList = blackList;
	}

	/**
	 * ��������� ������
	 */
	private void resizeUp() {
		Object[] temp = new Object[(this.stackArray.length * 7) / 4];
		System.arraycopy(stackArray, 0, temp, 0, stackArray.length);
		this.stackArray = temp;
	}

	/**
	 * ����� ���������� �������� � ����, ���� �� �� �������� � ������ ������
	 * 
	 * @param obj <code>Object</code>
	 */
	public boolean addElement(Object obj) {
		if (obj == null) {
			return false;
		}
		if (blackList.checkObject(obj)) {
			System.out.println("class is BlackList");
			return false;
		}
		if (n == stackArray.length) {
			this.resizeUp();
		}
		stackArray[n++] = obj;
		return true;

	}

	/**
	 * �������� ��������� ������� ����� � ������� ���
	 * 
	 * @return <code>Object</code>
	 */
	public Object getLastElementAndDel() {
		if (n == 0) {
			return null;
		}
		Object temp = stackArray[--n];
		stackArray[n] = null;
		return temp;
	}

	/**
	 * �������� ��������� ������� �����
	 * 
	 * @return <code>Object</code>
	 */
	public Object getLastElement() {
		if (n == 0) {
			return null;
		}
		return stackArray[n - 1];
	}

	/**
	 * Text representation of the stack
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (stackArray[i] == null) {
				continue;
			}
			sb.append(stackArray[i].getClass() + "   ").append(stackArray[i]);
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
}