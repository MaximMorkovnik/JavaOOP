/**
 * Мое исключение при переполнении группы
 */
package com.gmail.morkovnik.maxim;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "The group is full!";
	}
}
