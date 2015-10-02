package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

public class TestSudokuVerifier {

	SudokuVerifier verifier = new SudokuVerifier();
	String correctRow = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String incorrectRow = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	
	@Test
	public void testVerifier() {
		String firstRow = exampleRow.substring(0, 8);
		verifier.verify(firstRow);
		
	}

}
