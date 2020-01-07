package com.gmail.morkovnik.maxim;

import java.math.BigInteger;

public class Factorial implements Runnable {
	private int n;

	public Factorial(int n) {
		super();
		this.n = n;
	}

	public Factorial() {
		super();
	}

	public BigInteger calculateFactorial(int n) {
		BigInteger factorial = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			factorial = factorial.multiply(new BigInteger("" + i));
		}
		return factorial;
	}

	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " " + "  = " + calculateFactorial(n));
	}
}
