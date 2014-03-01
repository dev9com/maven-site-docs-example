package com.dev9;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	static final Logger LOG = LoggerFactory.getLogger(CalculatorTest.class);

	// TODO Add some more javadoc here!
	@Test
	public void testAdd() {
		assertThat(calculator.value()).isZero();
		calculator.add(5);
		assertThat(calculator.value()).isEqualTo(5);
	}

	@Test
	public void testSubtract() {
		assertThat(calculator.value()).isZero();
		calculator.subtract(5);
		assertThat(calculator.value()).isEqualTo(-5);

	}

	@Test
	public void testMultiply() {
		assertThat(calculator.value()).isZero();

		calculator.add(5).multiply(2);

		assertThat(calculator.value()).isEqualTo(10);

	}

	@Test
	public void testDivide() {
		assertThat(calculator.value()).isZero();

		calculator.add(10).divide(2);

		assertThat(calculator.value()).isEqualTo(5);

	}

	/**
	 * 
	 * @see <a href=
	 *      "http://stackoverflow.com/questions/14137989/java-division-by-zero-doesnt-throw-an-arithmeticexception-why"
	 *      >Why doesn't divide by zero return an error?</a>
	 * */
	@Test()
	public void testDivideByZero() {
		calculator.divide(2);
		LOG.info("Divide by zero results in... {}", calculator.value());
		assertThat(calculator.value()).isEqualTo(0);
	}

}
