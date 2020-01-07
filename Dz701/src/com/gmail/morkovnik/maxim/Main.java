/*
 * —уществуют три корабл€. Ќа каждом из них 10 €щиков груза. ќни одновременно прибыли в порт, в котором только два
 * дока. —корость разгрузки - 1 €щик в 0.5 сек. Ќапишите программу, котора€, управл€€ корабл€ми, позволит им
 * правильно разгрузить груз.
 */
package com.gmail.morkovnik.maxim;

public class Main {

	public static void main(String[] args) {

		final int shipCount = 3;
		Ship ship;

		try (Dockyard dockyard = new Dockyard(2)) {
			for (int i = 0; i < shipCount; i++) {
				ship = new Ship("Ship-" + i, 10, 500);
				dockyard.unloadShip(ship);
			}
		}
	}
}
