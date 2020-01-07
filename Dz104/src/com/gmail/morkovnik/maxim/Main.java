/**
 * Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
 * класс Network (сеть мобильного оператора). Телефон должен иметь метод
 * регистрации в сети мобильного оператора. Также у телефона должен быть метод call
 * (номер другого телефона), который переберет все телефоны, зарегистрированные в
 * сети. Если такой номер будет найден, то осуществить вызов, если нет - вывести
 * сообщение об ошибочности набранного номера.
 */
package com.gmail.morkovnik.maxim;

public class Main {

	public static void main(String[] args) {

		Network life = new Network();

		Phone phoneOne = new Phone(9355562, "Samsung S3");
		Phone phoneTwo = new Phone(1234567, "IPhone 2");
		Phone phoneThree = new Phone(7654321, "Nokia 3310");

		phoneOne.registerToNetwork(life);
		phoneTwo.registerToNetwork(life);
		phoneThree.registerToNetwork(life);

		phoneOne.call(1234567);
		phoneOne.call(12);
	}
}