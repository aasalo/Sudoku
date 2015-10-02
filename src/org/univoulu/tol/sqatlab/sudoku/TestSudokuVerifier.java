package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	SudokuVerifier verifier = new SudokuVerifier();

	@Test
	public void testVerifier() {
		String firstRow = "111111111222222222333333333444444444555555555666666666777777777888888888999999999";
		int result = verifier.verify(firstRow);
		assertEquals(-3, result);
		
	}
	
	@Test
	public void testFirstRowWithSecondRow(){
		String secondRow = "123456789222222222333333333444444444555555555666666666777777777888888888999999999";
		int result = verifier.verify(secondRow);
		assertEquals(-3, result);
	}
	
	@Test
	public void testLastRowForDuplicates(){
		String secondRow = "123456789123456789123456789123456789123456789123456789123456789123456789999999999";
		int result = verifier.verify(secondRow);
		assertEquals(-3, result);
	}
	
	@Test
	public void testStringLength(){
		String TooLongRow = "123423456789123456789123456789123456789123456789123456789123456789123456789999999999";
		int result = verifier.verify(TooLongRow);
		assertEquals(-1, result);
	}
	
	@Test
	public void testWithCorrectRow(){
		String correctRow = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int result = verifier.verify(correctRow);
		assertEquals(0, result);
	}

}