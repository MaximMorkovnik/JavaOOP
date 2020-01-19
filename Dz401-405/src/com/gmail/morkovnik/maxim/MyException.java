/**
 * Мое исключение при переполнении группы
 */
package com.gmail.morkovnik.maxim;

public class MyException extends Exception {

	@Override
	public String getMessage() {
		return "The group is full!";
	}
}
