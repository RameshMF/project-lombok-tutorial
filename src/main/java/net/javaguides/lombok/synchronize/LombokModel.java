package net.javaguides.lombok.synchronize;

import lombok.Synchronized;

public class LombokModel {

	@Synchronized
	private int addition(int a, int b) {
		return a + b;
	}

	@Synchronized
	private int subtraction(int a, int b) {
		return a - b;
	}

	@Synchronized
	private int division(int a, int b) {
		return a / b;
	}

	@Synchronized
	private int multiplication(int a, int b) {
		return a * b;
	}
}
