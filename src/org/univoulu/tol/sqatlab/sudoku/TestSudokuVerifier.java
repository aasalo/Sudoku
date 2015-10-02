package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

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
		String defaultRow = "123423456789123456789123456789123456789123456789123456789123456789123456789999999999";
		int result = verifier.verify(defaultRow);
		assertEquals(-1, result);
	}
	
	@Test
	public void 

}