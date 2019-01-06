package fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz underTest = new FizzBuzz();

	@Test
	public void shouldRespond1WhenUserEnters1() {
		String result = underTest.response(1);
		assertEquals("1", result);
		
	}
	@Test
	public void shouldRespond2WhenUserEnters2() {
		String result = underTest.response(2);
		assertEquals("2", result);
		
	}
	
	@Test
	public void shouldRespondFizzWhenUserEnters3() {
		String result = underTest.response(3);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void shouldRespondBuzzWhenUserEnters5() {
		String result = underTest.response(5);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void shouldRespondFizzWhenUserEnters6() {
		String result = underTest.response(6);
		assertEquals("Fizz", result);
	}
	

}
