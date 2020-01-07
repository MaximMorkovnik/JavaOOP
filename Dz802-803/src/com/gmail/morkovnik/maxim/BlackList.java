package com.gmail.morkovnik.maxim;

/**
 * Class representing a BlackList of classes
 * 
 * @version 0.1 29.11.2019
 * @author maxim.morkovnik
 */
public class BlackList {
	private Class<?>[] classArray = new Class<?>[5];
	private int n = 0;

	/**
	 * Default constructor
	 */
	public BlackList() {
		super();
	}

	/**
	 * Adds a class to the List
	 * 
	 * @param classOne <code>Class&lt;?></code>
	 */
	public void addClassToList(Class<?> classOne) {
		if (isClassPresent(classOne)) {
			return;
		}
		if (n == this.classArray.length) {
			Class<?>[] temp = new Class<?>[(classArray.length * 7) / 4 + 1];
			System.arraycopy(classArray, 0, temp, 0, classArray.length);
			classArray = temp;
		}
		classArray[n++] = classOne;
	}

	/**
	 * Checks for the present of a class
	 * 
	 * @param classOne <code>Class&lt;?></code>
	 */
	private boolean isClassPresent(Class<?> classOne) {
		for (Class<?> classTwo : classArray) {
			if (classTwo != null && classOne.equals(classTwo)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks for the present of a object
	 * 
	 * @param obj <code>Object</code>
	 */
	public boolean checkObject(Object obj) {
		return isClassPresent(obj.getClass());
	}
}