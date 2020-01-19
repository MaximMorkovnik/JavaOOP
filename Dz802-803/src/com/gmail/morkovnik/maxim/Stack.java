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
	 * Конструктор, принимающий стек BlackList
	 * 
	 * @param blackList <code>BlackList</code>
	 */
	public Stack(BlackList blackList) {
		super();
		this.blackList = blackList;
	}

	/**
	 * Получает данные blackList
	 * 
	 * @return <code>BlackList</code>
	 */
	public BlackList getBlackList() {
		return blackList;
	}

	/**
	 * Вводит данные blackList
	 * 
	 * @param blackList <code>BlackList</code>
	 */
	public void setBlackList(BlackList blackList) {
		this.blackList = blackList;
	}

	/**
	 * Расширяет массив
	 */
	private void resizeUp() {
		Object[] temp = new Object[(this.stackArray.length * 7) / 4];
		System.arraycopy(stackArray, 0, temp, 0, stackArray.length);
		this.stackArray = temp;
	}

	/**
	 * Метод добавления элемента в стек, если он не попадает в черный список
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
	 * Получает последний элемент стека и удаляет его
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
	 * Получает последний элемент стека
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
