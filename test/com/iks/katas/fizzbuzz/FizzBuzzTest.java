package com.iks.katas.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iks.katas.fizzbuzz.FizzBuzzGame;

class FizzBuzzTest {
	
	private FizzBuzzGame fizzBuzzGame;
	
	@BeforeEach
	void setUp() {		
		fizzBuzzGame = new FizzBuzzGame();
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturn1ForInput1() {
		// Arrange
		int input = 1;
		String expected = "1";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturn2ForInput2() {
		// Arrange
		int input = 2;
		String expected = "2";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnFizzForInput3() {
		// Arrange
		int input = 3;
		String expected = "Fizz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnBuzzForInput5() {
		// Arrange
		int input = 5;
		String expected = "Buzz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnFizzForInput6() {
		// Arrange
		int input = 6;
		String expected = "Fizz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnBuzzForInput10() {
		// Arrange
		int input = 10;
		String expected = "Buzz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnFizzBuzzForInput15() {
		// Arrange
		int input = 15;
		String expected = "FizzBuzz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnFizzBuzzForInput30() {
		// Arrange
		int input = 30;
		String expected = "FizzBuzz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnWhizzForInput7() {
		// Arrange
		int input = 7;
		String expected = "Whizz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnFizzWhizzForInput21() {
		// Arrange
		int input = 21;
		String expected = "FizzWhizz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}	
	
	@Test
	void testConvertToFizzBuzzShouldReturnBuzzWhizzForInput35() {
		// Arrange
		int input = 35;
		String expected = "BuzzWhizz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvertToFizzBuzzShouldReturnFizzBuzzWhizzForInput105() {
		// Arrange
		int input = 105;
		String expected = "FizzBuzzWhizz";
		
		// Act
		String actual = fizzBuzzGame.convertToFizzBuzz(input);
		
		// Assert
		assertEquals(expected, actual);
	}
	
}
