package com.dynacrongroup;

public class Calculator {

	private double state;

	public Calculator add(double value) {
		state += value;
		return this;
	}

	public Calculator subtract(double value) {
		state -= value;
		return this;
	}

	public Calculator multiply(double value) {
		state = state * value;
		return this;
	}

	public Calculator divide(double value) {
		state = state / value;
		return this;
	}

	public double value() {
		return state;
	}

	// TODO figure out the transwarp requirements.
	public double transwarp(double value) {
		throw new UnsupportedOperationException("No transwarp defined.");
	}

}
